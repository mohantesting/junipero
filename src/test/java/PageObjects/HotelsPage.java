package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.Utils;

/**
 * This Page is used for checking whether the result shown that is hotels are
 * from Mumbai
 *
 */
public class HotelsPage extends Utils {

	public HotelsPage(WebDriver ldriver) {
		driver = ldriver;
	}

	public static String check1;

	By handlePop = By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']");
	By clickLogin = By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");
	By clickHotel = By.linkText("Hotels");
	By hotelLocation = By.xpath("//span[@class='lbl_input latoBold  appendBottom5']");
	By clickLocation = By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']");
	By checkIn = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']");
	By checkOut = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected']");
	By searchHotel = By.id("hsw_search_button");
	By verifyPlaces = By.id("seoH1DontRemove");

	public void clickOnURL() throws IOException {
		openBrowser("Chrome", "https://www.makemytrip.com/");
	}

	// click on the hotels
	public void clickOnHotel() throws InterruptedException {
		try {
			driver.findElement(handlePop).isDisplayed();

			Thread.sleep(3000);
			driver.findElement(clickLogin).click();
			Thread.sleep(3000);
			driver.findElement(clickHotel).click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			driver.findElement(clickHotel).click();

		}

	}

	public void hotelLocationSearch() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(hotelLocation).click();
	}

	// clicking on Mumbai location
	public void clickOnLocation() throws InterruptedException {
		Thread.sleep(1000);
		WebElement name = driver.findElement(clickLocation);
		Thread.sleep(3000);
		name.sendKeys("Mumbai");
		Thread.sleep(5000);
		name.sendKeys(Keys.ARROW_DOWN);
		name.sendKeys(Keys.ENTER);
	}

	public void checkInAndOutDate() {
		WebElement checkInDate = driver.findElement(checkIn);

		WebElement checkOutDate = driver.findElement(checkOut);
		if (checkInDate.getAttribute("aria-selected").equalsIgnoreCase("true")
				&& checkOutDate.getAttribute("aria-selected").equalsIgnoreCase("true")) {
			checkInDate.click();
		}
		checkOutDate.click();
	}

	public void searchHotel() {
		driver.findElement(searchHotel).click();
	}

	public String verifyPlace() {
		WebElement check = driver.findElement(verifyPlaces);
		check1 = check.getText();
		System.out.println("Text is present");
		return check1;
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}