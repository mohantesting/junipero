package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


  @RunWith(Cucumber.class)
  
  @CucumberOptions( features =
  {"C:\\Users\\mohkumar\\eclipse-workspace\\Makemytrip\\src\\test\\resources\\Features\\Verify_the_amount.feature"}, 
  //The path of the feature file
  glue = {"StepDefinitions"},
  plugin={"pretty"}
  
  //monochrome = true,
  //dryRun = false 
  )
  
  public class MytestRunner {
  
  
  
  
  }
 

// import org.junit.runner.RunWith;
 //import cucumber.api.CucumberOptions;
 //import cucumber.api.junit.Cucumber;
  
 // @RunWith(Cucumber.class)
 
	/*
	 * @CucumberOptions(features = { "src/test/resources/Features" }, glue = {
	 * "StepDefinitions" }, monochrome = true, plugin = { "pretty",
	 * "html:target/cucumber" }) public class MytestRunner { }
	 */