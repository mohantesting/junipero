package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	

		public static WebDriver driver = null;
		static Properties defaultProps = new Properties();

		// This method is to open the browser for different web-drivers
		public static WebDriver openBrowser(String browser, String url) throws IOException {

			if (driver == null) {

				defaultProps.load(new FileInputStream("src\\main\\java\\config.properties"));

				if (browser.equalsIgnoreCase("Chrome")) {
					//System.setProperty("webdriver.chrome.driver", defaultProps.getProperty("chromeDriver"));
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					

					driver = new ChromeDriver();
					driver.get(url);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				} else {
					if (browser.equalsIgnoreCase("Firefox")) {
						System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

						driver = new FirefoxDriver();
						driver.get(url);
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					}
				}

			}

			return driver;
		}

	}


