package PageObjects;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {
	public static String TotalAmountReviewPage;
	public static String TotalAmountSummaryPage;

	public WebDriver ldriver;

	public FlightsPage(WebDriver rdriver) {
		ldriver = rdriver;
		//PageFactory.initElements(rdriver, this);
	}

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
	// @FindBy(xpath="//div[@class='headerOuter']")
	WebElement Element;
	
	

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

	public void clickFlights() {
		Flights.click();
	}

	public void searchPlace() throws InterruptedException {
		// Thread.sleep(1000);
		// FromTab.sendKeys("Mumbai,India");
		try {
			ldriver.findElement(handlePop).isDisplayed();

			Thread.sleep(3000);
			ldriver.findElement(clickLogin).click();
			Thread.sleep(3000);
			ldriver.findElement(searchPlace).click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			ldriver.findElement(searchPlace).click();

		}
	}

////	/*
////	 * public void clickMumbai() throws InterruptedException { Thread.sleep(1000);
////	 * Mumbai.click(); }
////	 */
//
//	public void clickToTab() throws InterruptedException {
//		// Thread.sleep(2000);
//		ToTab.click();
//	}
//
//	public void clickDelhi() throws InterruptedException {
//		Thread.sleep(1000);
//		Delhi.click();
//	}
//
//	public void clickDepartureTab() throws InterruptedException {
//		Thread.sleep(2000);
//		DepartureTab.click();
//	}
//
//	public void clickDate() throws InterruptedException {
//		Thread.sleep(1000);
//		thirtyOneAug.click();
//	}
//
//	public void Search() {
//		SearchBtn.click();
//	}
//
//	/*
//	 * public void clickOk() { OkBtn.click(); }
//	 */
//	public void clickNonStop() throws InterruptedException {
//		Thread.sleep(1000);
//		NonStop.click();
//	}
//
//	public void clickDepartureTime() throws InterruptedException {
//		Thread.sleep(500);
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		// js.executeScript("arguments[0].scrollIntoView();",DepartureTime);
//		js.executeScript("window.scrollBy(0,250)");
//		Thread.sleep(500);
//		DepartureTime.click();
//		// ldriver.findElement(DepartureTime).click();
//
//	}
//
//	public void clickViewPrices() throws InterruptedException {
//		Thread.sleep(500);
//		// JavascriptExecutor js =(JavascriptExecutor)ldriver;
//		// js.executeScript("argument[0].click();",ViewPrices );
//		// js.executeScript("document.getElementById('bookbutton-RKEY:1178f2b0-bf91-4fdb-af46-69253eb42cb0:8_0').click();");
//		// js.executeScript("window.scrollBy(0,0)");
//		// Thread.sleep(500);
//		ViewPrices.click();
//		// ldriver.findElement(ViewPrices).click();
//	}

	
	public void departurePlace() throws InterruptedException {
		ldriver.findElement(departurePlace).sendKeys("Mumbai", Keys.ARROW_DOWN, Keys.ENTER);
	}

	public void arrivalPlace() throws InterruptedException {
		WebElement To = ldriver.findElement(arrivalPlace);
		Thread.sleep(3000);
		To.sendKeys("Delhi");
		Thread.sleep(3000);
		To.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		To.sendKeys(Keys.ARROW_DOWN);
		To.sendKeys(Keys.ENTER);
	}

	public void departureDate() throws InterruptedException {
		WebElement date = ldriver.findElement(selectDate);
		if (date.getAttribute("aria-selected").equalsIgnoreCase("true"))
			date.click();

	}

	public void clickOnSearchFlight() throws InterruptedException {
		Thread.sleep(3000);
		ldriver.findElement(searchFlight).click();
	}

	public void clickOnNonstop() throws InterruptedException {
		ldriver.findElement(nonStopFlight).click();
	}

	public void checkflightTime() throws InterruptedException {
		ldriver.findElement(time).click();
	}

	public void clickOnViewPrice() throws InterruptedException {
		ldriver.findElement(viewPrice).click();
	}
	
	
	public void clickOnBookNow() throws InterruptedException {
		Thread.sleep(3000);
		ldriver.findElement(bookNow).click();

	}

	
	public void switchTabs() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)ldriver;

		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String>(ldriver.getWindowHandles());
		ldriver.switchTo().window(tabs2.get(1));
		Thread.sleep(10000);

		if (ldriver.findElements(secureTrip1).size() > 0) {
			js.executeScript("arguments[0].click();", ldriver.findElement(secureTrip));
			Thread.sleep(1000);
		}
		if (ldriver.findElements(secureTrips2).size() > 0) {
			js.executeScript("arguments[0].click();", ldriver.findElement(secureTrip3));
			Thread.sleep(1000);

		}
	}

	/**
	 * Adding traveller details
	 * 
	 * @throws InterruptedException
	 */
	public void travellerDetails() throws InterruptedException {

		Thread.sleep(3000);

		int addnewadult = ldriver.findElements(By.xpath("//button[text()='+ ADD NEW ADULT']")).size();

		String TotalAmountSummaryPage;
		String TotalAmountReviewPage;
		if (addnewadult > 0) {
			ldriver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();

			ldriver.findElement(nameDetails).sendKeys("mohan");
			ldriver.findElement(lastName).sendKeys("kumar");
			ldriver.findElement(gender).click();
			ldriver.findElement(email).sendKeys("testing.sdet17@gmail.com");
			Thread.sleep(1000);
			ldriver.findElement(clickEmail).click();
			Thread.sleep(1000);
			ldriver.findElement(number).sendKeys("6887877979");
			TotalAmountReviewPage = ldriver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
					.replaceAll(",", "");

			ldriver.findElement(continueButton).click();
			Thread.sleep(5000);

			ldriver.findElement(confirmButton).click();
			Thread.sleep(4000);

			ldriver.findElement(yesPopup).click();

			TotalAmountSummaryPage = ldriver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
					.replaceAll(",", "");

		} else {
			int TAmount = ldriver.findElements(tamount1).size();
			if (TAmount > 0) {
				TotalAmountReviewPage = ldriver.findElement(tamount1).getText().trim().replaceAll("₹ ", "")
						.replaceAll(",", "");
				Thread.sleep(2000);
				Actions actions = new Actions(ldriver);
				actions.moveToElement(ldriver.findElement(reviewContinue));
				actions.click().build().perform();

				Thread.sleep(5000);
				ldriver.findElement(nameDetails).sendKeys("mohan");
				ldriver.findElement(lastName).sendKeys("kumar");
				ldriver.findElement(gender).click();
				ldriver.findElement(email).sendKeys("testing.sdet17@gmail.com");

				ldriver.findElement(number).sendKeys("6887877979");
				TotalAmountSummaryPage = ldriver.findElement(tamount1).getText().trim().replaceAll("₹ ", "")
						.replaceAll(",", "");

			} else {
				TotalAmountReviewPage = ldriver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
						.replaceAll(",", "");
				Thread.sleep(2000);
				Actions actions = new Actions(ldriver);
				actions.moveToElement(ldriver.findElement(reviewContinue));
				actions.click().build().perform();

				Thread.sleep(5000);
				ldriver.findElement(nameDetails).sendKeys("rohit");
				ldriver.findElement(lastName).sendKeys("sharma");
				ldriver.findElement(gender).click();
				ldriver.findElement(email).sendKeys("mailmohanhosur@gmail.com");

				Thread.sleep(1000);
				ldriver.findElement(number).sendKeys("1234567890");
				TotalAmountSummaryPage = ldriver.findElement(TotalAmountReviewPage1).getText().replaceAll("₹ ", "")
						.replaceAll(",", "");
			}
		}

		System.out.println("Case is passed");
	}

	/**
	 * Closing the web-browser
	 */
	public void closeBrowser() {
		ldriver.close();
		ldriver.quit();
	}
}

	/*
	 * public void clickSecureMyTrip() throws InterruptedException {
	 * Thread.sleep(6000);
	 * 
	 * //JavascriptExecutor js =(JavascriptExecutor)ldriver;
	 * //js.executeScript("arguments[0].scrollIntoView(true);",SecureMyTrip);
	 * //js.executeScript("argument[0].click();",ViewPrices );
	 * //js.executeScript("window.scrollBy(0,1250)"); Actions actions= new
	 * Actions(ldriver); actions.moveToElement(SecureMyTrip).perform();
	 * 
	 * 
	 * //Thread.sleep(500);
	 * 
	 * //SecureMyTrip.click(); }
	 * 
	 * 
	 * public void clickConfirmPassenger() throws InterruptedException {
	 * Thread.sleep(1000); ConfirmPassenger.click(); }
	 * 
	 * 
	 * public String getTotalAmountInFarePage() { return ldriver.getTitle(); }
	 * 
	 * public String getTotalAmountInPreviousPage() { return ldriver.getTitle(); }
	 * 
	 * public void clickElement() { Element.click(); }
	 */


