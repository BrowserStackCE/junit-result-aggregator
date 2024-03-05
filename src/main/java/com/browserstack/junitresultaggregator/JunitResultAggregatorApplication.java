package com.browserstack.junitresultaggregator;


import com.browserstack.junit.Entities.Testsuites;

import com.browserstack.junit.Entities.Testsuite;
import com.browserstack.junit.Utils.CommandLineOptions;
import com.browserstack.junit.Utils.FileUtils;
import com.browserstack.junit.Utils.RestUtils;
import com.browserstack.junit.Utils.XmlUtils;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.cli.*;
import org.apache.commons.io.FilenameUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Driver class for the Junit Result Uploader. Get the input from the user & aggregate the results into one single xml file
 * Uploads the data to Test Observability
 * @author venkatesh
 * @since 2024-03-04
 */
@SpringBootApplication
public class JunitResultAggregatorApplication {

    public static void main(String[] args) throws IOException, UnirestException {

        SpringApplication.run(JunitResultAggregatorApplication.class, args);

        String projectName,build,buildIdentifier,tags,ci,framework,inputdir=null, outdir=null;
        HashMap<String,Object> commandOptions=new HashMap<>();
        Options options = CommandLineOptions.cliParams();
        // create the parser
        CommandLineParser parser = new DefaultParser();
        try {
            // parse the command line arguments
            CommandLine line = parser.parse(options, args);

            if(line.hasOption("h"))
            {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("junitupload", options);
                System.out.println("Press Enter key to exit!!");
                Scanner scanner = new Scanner(System.in);
                String readString = scanner.nextLine();
                System.exit(0);

            }
            if(line.hasOption("v"))
            {
                System.out.println("Version 1.0.0");
                System.exit(0);
            }

            if(line.hasOption("p"))
            {
                projectName=line.getOptionValue("p");
                commandOptions.put("projectName", projectName);
            }

            if(line.hasOption("b"))
            {
                build=line.getOptionValue("b");
                commandOptions.put("buildName", build);
            }

            if(line.hasOption("i"))
            {
                buildIdentifier=line.getOptionValue("i");
                commandOptions.put("buildIdentifier", buildIdentifier);
            }

            if(line.hasOption("t"))
            {
                tags=line.getOptionValue("t");
                commandOptions.put("tags", tags);
            }

            if(line.hasOption("c"))
            {
                ci=line.getOptionValue("c");
                commandOptions.put("ci", ci);
            }

            if(line.hasOption("f"))
            {
                framework=line.getOptionValue("f");
                commandOptions.put("frameworkVersion", framework);
            }
            if(line.hasOption("d"))
            {
                inputdir=line.getOptionValue("d");
            }
            if(line.hasOption("o"))
            {
                outdir=line.getOptionValue("o");
            }
        }
        catch (ParseException exp) {
            // oops, something went wrong
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
        }


        //Verify if the input directory is present in the params
        FileUtils fileutils=new FileUtils();
        if(inputdir!=null) {
            if (inputdir.isBlank() || inputdir.isEmpty()) {
                System.out.println("Input directory cannnot be empty");
                System.exit(-1);
            }
        }else
        {
            System.out.println("Require Input directory");
            System.exit(-1);
        }

        //Identify all xml files from path
        Set<Path> files=fileutils.listFilesUsingFileWalk(inputdir, 30);
        Iterator itr=files.iterator();
        System.out.println("File size => "+files.size());
        System.out.println("Files present in the directory!!!");

        //Store the junit xml file names in a temporary array list for later usage
        ArrayList<File> filelist=new ArrayList<>();
        while(itr.hasNext())
        {
            String fileName=itr.next().toString();
            System.out.println("FileName => "+ fileName);
            filelist.add(new File(fileName));
        }

        //Create an Object to store the deserialized xml file
        Testsuites xmldata=null;
        float duration=0.0f;
        String buildName="";
        ArrayList<Testsuite> testSuites=new ArrayList<>();

        //Deserialize all files in the directory & aggregate them to Testsuite array list
        for (File file:filelist) {
            XmlUtils utils = new XmlUtils();
            xmldata = utils.deserializeXml(file);
            duration+=Float.valueOf(xmldata.getTime());
            if(buildName.isEmpty()) {
                buildName = xmldata.getName();
            }
            for (Testsuite suite : xmldata.getTestsuite()) {
                testSuites.add(suite);
            }

        }

        //Sort the results in chronological order using timestamp attribute from the xml file
        List<Testsuite> sortedTestsuitesList=testSuites.stream().sorted((item1, item2) -> item1.getTimestamp().compareTo(item2.getTimestamp())).collect(Collectors.toList());



        //Collate results from the Testsuite class
        int numTests=0, failures=0,errors=0;
        float time=0.0f;
        for (Testsuite suite: sortedTestsuitesList) {
            numTests+=Integer.valueOf(suite.getTests());
            failures+=Integer.valueOf(suite.getFailures());
            errors+=Integer.valueOf(suite.getErrors());
            time+=Float.valueOf(suite.getTime());
        }


        System.out.println("Num of tests :"+numTests+"; failures:"+failures+"; Errors:"+errors+"; Time:"+duration);

        //Create new Object for serializing the consolidated xml file
         Testsuites resultSuite=new Testsuites();
         resultSuite.setErrors(String.valueOf(errors));
         resultSuite.setFailures(String.valueOf(failures));
         resultSuite.setTests(String.valueOf(numTests));
         resultSuite.setTime(String.valueOf(duration));
         resultSuite.setName(buildName);
         resultSuite.setTestsuite(sortedTestsuitesList);

        //Verify if Output directory is provided  & if not, then get the cwd
        if(outdir!=null)
        {
          if(outdir.isEmpty() || outdir.isBlank())
          {
            outdir= System.getProperty("user.dir");
          }
        }else
        {
            outdir= System.getProperty("user.dir");
        }


        //Serialize the consolidated results to xml file
        File resultFile = new File(FilenameUtils.concat(outdir,"result.xml"));
        new XmlUtils().serializeXml(resultFile, resultSuite);

        //Call the Junit upload endpoint & process the response
        HttpResponse<JsonNode> response= RestUtils.uploadResults(resultFile,commandOptions);
        if(response.getStatus()==200)
        {
            System.out.println(response.getBody().toString());
        }else
        {
            System.out.println("Reqeust failed => "+ response.getStatus()+";\n Response => "+response.getBody().toString());
            System.exit(-1);
        }

    }

}
