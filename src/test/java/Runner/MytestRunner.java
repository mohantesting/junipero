package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
     features = {"C:\\Users\\mohkumar\\eclipse-workspace\\Makemytrip\\src\\test\\resources\\Features\\Verify_the_amount.feature"}, //The path of the feature file
     glue = {"StepDefinitions","AppHooks"}, 
     plugin={"pretty"}
     //monochrome = true, 
     //dryRun = false
     )
     
public class MytestRunner {
	
	
	

}
