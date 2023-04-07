package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/bhumidobariya/eclipse-workspace/facebook/src/test/java/feature", //the path of the feature files
		glue = {"stepdefination"},
		monochrome = true, //display the console output in a proper readable format
		plugin =  {"pretty","junit:junit_xml/cucumber.xml"} //to generate different types of reporting
		
		)
 
public class TestRunner {
	

}
	
