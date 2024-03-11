package com.browserstack.TransformerUtils;

import com.browserstack.jest.Entities.JestJson;
import com.browserstack.junit.Entities.Testsuites;
import com.browserstack.junit.Utils.CommandLineOptions;
import com.browserstack.junit.Utils.JsonUtils;
import com.browserstack.junit.Utils.RestUtils;
import com.browserstack.junit.Utils.XmlUtils;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.cli.*;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


@Component
public class TransformerSvc implements CommandLineRunner {

    @Autowired
    JsontoJunitMapperImpl transformerService;

    public static void uploadJunit(File resultFile, HashMap<String, Object> commandOptions) throws UnirestException {

        //Call the Junit upload endpoint & process the response
        HttpResponse<JsonNode> response = RestUtils.uploadResults(resultFile, commandOptions);
        if (response.getStatus() == 200) {
            System.out.println(response.getBody().toString());
        } else {
            System.out.println("Reqeust failed => " + response.getStatus() + ";\n Response => " + response.getBody().toString());
            System.exit(-1);
        }

    }

    public void transform(String... args) throws IOException, UnirestException {

        HashMap<String, Object> commandOptions = new HashMap<>();
        Options options = CommandLineOptions.cliParams();

        String outdir = null;
        String projectName, build, buildIdentifier, tags, ci, framework, inputdir = null;

        // create the parser
        CommandLineParser parser = new DefaultParser();
        try {
            // parse the command line arguments
            CommandLine line = parser.parse(options, args);

            if (line.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("junitupload", options);
                System.out.println("Press Enter key to exit!!");
                Scanner scanner = new Scanner(System.in);
                String readString = scanner.nextLine();
                System.exit(0);

            }
            if (line.hasOption("v")) {
                System.out.println("Version 1.0.0");
                System.exit(0);
            }

            if (line.hasOption("p")) {
                projectName = line.getOptionValue("p");
                commandOptions.put("projectName", projectName);
            }

            if (line.hasOption("b")) {
                build = line.getOptionValue("b");
                commandOptions.put("buildName", build);
            }

            if (line.hasOption("i")) {
                buildIdentifier = line.getOptionValue("i");
                commandOptions.put("buildIdentifier", buildIdentifier);
            }

            if (line.hasOption("t")) {
                tags = line.getOptionValue("t");
                commandOptions.put("tags", tags);
            }

            if (line.hasOption("c")) {
                ci = line.getOptionValue("c");
                commandOptions.put("ci", ci);
            }

            if (line.hasOption("f")) {
                framework = line.getOptionValue("f");
                commandOptions.put("frameworkVersion", framework);
            }
            if (line.hasOption("d")) {
                inputdir = line.getOptionValue("d");
            }
            if (line.hasOption("o")) {
                outdir = line.getOptionValue("o");
            }
        } catch (ParseException exp) {
            // oops, something went wrong
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
        }

        //File file = new File("/Users/venkatesh/Projects/Debugging/Coursera/workingdir/jest.json");
        File file =new File(inputdir);
        JsonUtils utils = new JsonUtils();
        JestJson results = utils.deserializeJson(file);
        Double numOfTests = results.getNumTotalTests();
        System.out.println(numOfTests);
        Testsuites suites = transformerService.jsontoJunit(results);
        System.out.println("Conversion completed");


        //String outdir="/Users/venkatesh/Projects/Debugging/Coursera/workingdir";

        System.out.println("Out Directory => " + outdir);
        //Serialize the consolidated results to xml file
        File resultFile = new File(FilenameUtils.concat(outdir, "result.xml"));
        new XmlUtils().serializeXml(resultFile, suites);

        uploadJunit(resultFile, commandOptions);

    }

    @Override
    public void run(String... args) throws Exception {
        transform(args);
    }
}
