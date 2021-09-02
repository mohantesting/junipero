package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qa.factory.DriverFactory;

import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ApplicationHooks {
	
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driverfactory.init_driver(browserName);
		
		
	}
	/*@After(order=0)
	public void quitBrowser() {
		driver.quit();
		}
	@After(order=1)
	public void tearDown(Scenario scenario) {
		
	if(scenario.isFailed()) {
		
		String screenshotName = scenario.getName().replaceAll(null, null);
		byte[] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
		
	}*/
	
	
	}

	
	
	


