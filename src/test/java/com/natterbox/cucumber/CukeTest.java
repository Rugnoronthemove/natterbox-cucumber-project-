package com.natterbox.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

//need to learn to write by default without copying by heart
@RunWith(Cucumber.class)
@CucumberOptions(
        //feature file path
        features = ".",
        //creates report in jenkins path for the report        //creates Default Cucumber report             //creates Cucumber Extent reports
        plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        //true displays white font in console  //not mandatory but by default monochromes value is false so need to declare if you need it as true
        monochrome = true
        //tags assists with running tag specific feature file if you have multiple feature files
        //or tag specific scenario or scenarios
//        tags = {"@Sanity"}
)

public class CukeTest {

    //configuration for junit setting up extent report
    @AfterClass
    public static void setUp() {

        String projectPath = System.getProperty("user.dir");
        //generates Extent report in the given path
        String reportConfigPath = projectPath + "/src/test/java/com/demo/nopcommerce/resources/extentreport/extent-config.xml";
        //using the Reporter from cucumber.Listener
        Reporter.loadXMLConfig(reportConfigPath);

        //The below code generates details of environment information
        // System.getProperty gets system name & system timezone
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        //generic info of the machine
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        //selenium version
        Reporter.setSystemInfo("Selenium Version", "3.141.59");
        //maven version
        Reporter.setSystemInfo("Maven Version", "3.5.2");
        //java version
        Reporter.setSystemInfo("Java Version", "1.8.0_151");

    }
}
