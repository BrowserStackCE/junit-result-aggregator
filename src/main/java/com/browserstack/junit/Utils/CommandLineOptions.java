package com.browserstack.junit.Utils;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

/**
 * This class holds all CLI arguments. This class uses the Apache Commons-cli library
 * @author venkatesh
 * @since 2024-03-04
 */
public class CommandLineOptions {

    public static Options cliParams()
    {
        Options options = new Options();
        options.addOption("p", "projectname", true, "Project name to be used in Test Observability Dashboard");
        options.addOption("b", "buildname", true, "Build Name in Test observability");
        options.addOption("i", "buildidentifier", true, "Unique identifier for the build run");
        options.addOption("c", "ci", true, "Continuous integration url for the build");
        options.addOption("t", "tags", true, "Tags that can be added to the build for better filtering");
        options.addOption("f", "framework", true, "Framework Version, example 'mocha, 10.0'");
        options.addOption("h","help",false,"All acceptable flags for the binary");
        options.addOption("v", "version",false, "Print version & exit");
        options.addOption("d", "dir",true, "Input directory with all junit xml files");
        options.addOption("o", "output",true,"Output directory with aggregated result");
        return options;

    }
}
