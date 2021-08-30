package Parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



RunWith(Cucumber.class)
@CucumberOptions(
     features = {"src/test/resources/Parallel"}, //The path of the feature file
     glue = {"Parallel"}, 
     plugin={"pretty",
    		 
    		 "timeline:test-output-thread/"},
     monochrome = true
     //dryRun = false
     )

public class ParallelRun extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
