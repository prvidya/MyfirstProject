package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
//@RunWith comes from JUnit 
// Cucumber.class from cucumber.api.junit.Cucumber
//CucumberOptions from cucumber api

	@RunWith(Cucumber.class)   
	
	@CucumberOptions(
	 features = "src/main/java/features/hooks.feature", // It is the path where feature file is available
	 glue = {"com.practice.stepDefinitions"}, // The path of the step definitions.
	 format = {"pretty", "html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // To generate different types of reporting
	 monochrome = true, // To display the console output in a proper readable format(recommended to use).
	 dryRun = false,  // To check the mapping is proper between Feature file and step definition file
	 strict = true // It will check if any step is not defined inside step definition file.
//	 tags = {"~@SmokeTest", "@RegressionTest"}
	)

			
	
	public class TestRunner {
		 
}
//	ORed : tags = {"@SmokeTest, @RegressionTest"} ---> Execute all tests tagged as @SmokeTest OR @RegressionTest
//	ANDed : tags = {"@SmokeTest", "@RegressionTest"} ---> Execute all tests tagged as @SmokeTest AND @RegressionTest
//	To ignore : Use ~