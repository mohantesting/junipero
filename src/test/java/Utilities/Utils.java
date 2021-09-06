package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Util class to add methods to open different browsers
 *
 */
public class Utils {

	public static WebDriver driver = null;
	static Properties defaultProps = new Properties();

	// This method is to open the browser for different web-drivers
	public static WebDriver openBrowser(String browser, String url) throws IOException {

		if (driver == null) {

			defaultProps.load(new FileInputStream("src\\test\\resources\\Config\\config.properties"));

			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", defaultProps.getProperty("chromeDriver"));

				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} else {
				if (browser.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.chrome.driver", defaultProps.getProperty("geckoDriver"));

					driver = new FirefoxDriver();
					driver.get(url);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
			}

		}

		return driver;
	}

}
