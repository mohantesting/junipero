package PageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import Utilities.Utils;

/**
 * This class is used to book the flights and verify the amount
 * 
 *
 */
public class FlightsPage extends Utils {

	public static String TotalAmountReviewPage;
	public static String TotalAmountSummaryPage;

	@FindBy(xpath = "(//span[@class='chNavText darkGreyText'])[1]")
	WebElement Flights;

	@FindBy(xpath = "//label[@for='fromCity']")
	WebElement FromTab;

	@FindBy(xpath = "(//p[.='Mumbai, India'])[1]")
	WebElement Mumbai;

	@FindBy(xpath = "//label[@for='toCity']")
	WebElement ToTab;

	@FindBy(xpath = "//p[.='Delhi, India']")
	WebElement Delhi;

	@FindBy(xpath = "//label[@for='departure']")
	WebElement DepartureTab;

	@FindBy(xpath = "(//p[.='3'])[1]")
	WebElement thirtyOneAug;

	@FindBy(xpath = "//a[.='Search'] ")
	WebElement SearchBtn;

	@FindBy(xpath = "//button[.='OKAY, GOT IT!']")
	WebElement OkBtn;

	@FindBy(xpath = "(//span[@class='box'])[10]")
	WebElement NonStop;

	@FindBy(xpath = "(//div[@class='appendBottom12 filterTimeSlots '])[2]")
	WebElement DepartureTime;

	@FindBy(xpath = "(//span[.='View Prices'])[1]")
	WebElement ViewPrices;

	@FindBy(xpath = "(//button[.='Book Now'])[1]")
	WebElement BookNow;

	@FindBy(xpath = "(//INPUT[@TYPE='radio'])[1]")
	WebElement SecureMyTrip;

	@FindBy(xpath = "(//span[@class='box'])[1]")
	WebElement ConfirmPassenger;

	@FindBy(xpath = "(//span[@class='fontSize16 blackFont'])[2]")
	WebElement TotalAmountInFareSummary;

	@FindBy(xpath = "(//p[@class=' blackText fontSize18 blackFont white-space-no-wrap'])[1]")
	WebElement TotalAmountInPreviousPage;

	@FindBy(xpath = "//div[@data-cy='outsideModal']")
	WebElement Element;

	By handlePop = By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']");
	By clickLogin = By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");
	By searchPlace = By.xpath("//span[text()='From']");

	By departurePlace = By.xpath("//input[@placeholder='From']");

	By arrivalPlace = By.xpath("//input[@placeholder='To']");
	By selectDate = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']");
	By searchFlight = By.xpath("//a[text()='Search']");
	By nonStopFlight = By.xpath("(//span[text()='Non Stop'])[1]");
	By time = By.xpath("(//div[@class='boldFont'])[2]");
	By viewPrice = By.xpath("(//span[@class='customArrow arrowDown'])[1]");
	By bookNow = By.xpath("//button[text()='Book Now']");
	By secureTrip = By.xpath("(//span[text()='Yes, secure my trip,']//parent::div//preceding-sibling::span)[1]");
	By secureTrip1 = By.xpath("(//span[text()='Yes, secure my trip,']//parent::div//preceding-sibling::span)[1]");
	By secureTrips2 = By.xpath("((//div[@class='insRadioSection appendBottom8 '])[1]//span)[1]");
	By secureTrip3 = By.xpath("((//div[@class='insRadioSection appendBottom8 '])[1]//span)[1]");
	By continueButton = By.xpath("//button[text()='Continue']");
	By nameDetails = By.xpath("//input[@placeholder='First & Middle Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By gender = By.xpath("//label[@tabindex='0']");
	By popup = By.xpath("//a[text()='Done']");
	By wheelChair = By.xpath("(//div[@class='dropdown__indicator dropdown__dropdown-indicator css-1eew81i'])[1]");
	By number = By.xpath("//input[@placeholder='Mobile No']");
	By email = By.xpath("//input[@placeholder='Email']");
	By clickEmail = By.xpath("//div[.='testing.sdet17@gmail.com']");
	By travelContinue = By.xpath("//button[text()='Continue']");
	By reviewContinue = By.id("review-continue");
	By confirm = By.xpath("//a[text()='CONFIRM']");
	By confirmButton = By.xpath("//button[text()='CONFIRM']");
	By iternaryAmount = By.xpath("//p[@class='fareSmry-row LatoBold']//span[2]/span/span");
	By bookingAmount = By.xpath("//span[@class='total_ancillary_fare']/span/span");
	By yesPopup = By.xpath("//button[text()='Yes, Please']");
	By completeIternary = By.xpath("(//span[@class='fontSize16 blackFont'])[2]");
	By finalIternary = By.xpath("//p[@class='fareRow']/span[2]");
	By TotalAmountReviewPage1 = By.xpath("//span[text()='Total Amount']//following-sibling::span");
	By tamount1 = By.xpath("//span[text()='Total Amount:']//ancestor::span//following-sibling::span/span/span");

	public FlightsPage(WebDriver ldriver) {
		driver = ldriver;
	}

	public void clickOnURL() throws IOException {
		openBrowser("Chrome", "https://www.makemytrip.com/");
		System.out.println(driver);
	}

	public void clickFlights() {
		Flights.click();
	}

	// clicking From Place
	public void searchPlace() throws InterruptedException {

		try {
			driver.findElement(handlePop).isDisplayed();

			Thread.sleep(3000);
			driver.findElement(clickLogin).click();
			Thread.sleep(3000);
			driver.findElement(searchPlace).click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			driver.findElement(searchPlace).click();

		}
	}

	public void departurePlace() throws InterruptedException {
		driver.findElement(departurePlace).sendKeys("Mumbai", Keys.ARROW_DOWN, Keys.ENTER);
	}

	// clicking To place
	public void arrivalPlace() throws InterruptedException {
		WebElement To = driver.findElement(arrivalPlace);
		Thread.sleep(3000);
		To.sendKeys("Delhi");
		Thread.sleep(3000);
		To.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		To.sendKeys(Keys.ARROW_DOWN);
		To.sendKeys(Keys.ENTER);
	}

	public void departureDate() throws InterruptedException {
		WebElement date = driver.findElement(selectDate);
		if (date.getAttribute("aria-selected").equalsIgnoreCase("true"))
			date.click();

	}

	public void clickOnSearchFlight() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(searchFlight).click();
	}

	public void clickOnNonstop() throws InterruptedException {
		driver.findElement(nonStopFlight).click();
	}

	public void checkflightTime() throws InterruptedException {
		driver.findElement(time).click();
	}

	public void clickOnViewPrice() throws InterruptedException {
		driver.findElement(viewPrice).click();
	}

	public void clickOnBookNow() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(bookNow).click();

	}

	// switching tabs

	public void switchTabs() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(10000);

		if (driver.findElements(secureTrip1).size() > 0) {
			js.executeScript("arguments[0].click();", driver.findElement(secureTrip));
			Thread.sleep(1000);
		}
		if (driver.findElements(secureTrips2).size() > 0) {
			js.executeScript("arguments[0].click();", driver.findElement(secureTrip3));
			Thread.sleep(1000);

		}
	}

	/**
	 * Adding traveller details
	 * 
	 * @throws InterruptedException
	 */
	@SuppressWarnings("unused")
	public void travellerDetails() throws InterruptedException {

		Thread.sleep(3000);

		int addnewadult = driver.findElements(By.xpath("//button[text()='+ ADD NEW ADULT']")).size();

		String TotalAmountSummaryPage;
		String TotalAmountReviewPage;
		if (addnewadult > 0) {
			driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();

			driver.findElement(nameDetails).sendKeys("mohan");
			driver.findElement(lastName).sendKeys("kumar");
			driver.findElement(gender).click();
			driver.findElement(email).sendKeys("testing.sdet17@gmail.com");
			Thread.sleep(1000);
			driver.findElement(clickEmail).click();
			Thread.sleep(1000);
			driver.findElement(number).sendKeys("6887877979");
			TotalAmountReviewPage = driver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
					.replaceAll(",", "");

			driver.findElement(continueButton).click();
			Thread.sleep(5000);

			driver.findElement(confirmButton).click();
			Thread.sleep(4000);

			driver.findElement(yesPopup).click();

			TotalAmountSummaryPage = driver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
					.replaceAll(",", "");

		} else {
			int TAmount = driver.findElements(tamount1).size();
			if (TAmount > 0) {
				TotalAmountReviewPage = driver.findElement(tamount1).getText().trim().replaceAll("₹ ", "")
						.replaceAll(",", "");
				Thread.sleep(2000);
				Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(reviewContinue));
				actions.click().build().perform();

				Thread.sleep(5000);
				driver.findElement(nameDetails).sendKeys("mohan");
				driver.findElement(lastName).sendKeys("kumar");
				driver.findElement(gender).click();
				driver.findElement(email).sendKeys("testing.sdet17@gmail.com");

				driver.findElement(number).sendKeys("6887877979");
				TotalAmountSummaryPage = driver.findElement(tamount1).getText().trim().replaceAll("₹ ", "")
						.replaceAll(",", "");

			} else {
				TotalAmountReviewPage = driver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
						.replaceAll(",", "");
				Thread.sleep(2000);
				Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(reviewContinue));
				actions.click().build().perform();

				Thread.sleep(5000);
				driver.findElement(nameDetails).sendKeys("rohit");
				driver.findElement(lastName).sendKeys("sharma");
				driver.findElement(gender).click();
				driver.findElement(email).sendKeys("mailmohanhosur@gmail.com");

				Thread.sleep(1000);
				driver.findElement(number).sendKeys("1234567890");
				TotalAmountSummaryPage = driver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
						.replaceAll(",", "");
			}
		}

		System.out.println("Case is passed");
	}

	/**
	 * Closing the web-browser
	 */
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
