package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage {

	public WebDriver ldriver;
	
	public HotelsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	/*
	 * @FindBy(xpath="(//span[@class='chNavText darkGreyText'])[2]") WebElement
	 * Hotels;
	 * 
	 * @FindBy(xpath="//label[@for='city']") WebElement ForCity;
	 * 
	 * @FindBy(xpath="//li[@id='react-autowhatever-1-section-1-item-1']") WebElement
	 * Mumbai1;
	 * 
	 * @FindBy(xpath="//button[@id='hsw_search_button']") WebElement Searchbutton;
	 * 
	 * 
	 * @FindBy(xpath="//p[.='Hotels, Villas, Apartments and more in Mumbai']") By
	 * MumbaiHotels;
	 */
	
	
	
	
	/*
	 * public void clickHotels() { Hotels.click(); }
	 * 
	 * 
	 * public void clickForCity() { ForCity.click(); }
	 * 
	 * public void clickMumbai1() { Mumbai1.click(); }
	 * 
	 * public void clickSearch() { Searchbutton.click(); }
	 * 
	 * public boolean MumbaiTextExist() { return
	 * ldriver.findElement(MumbaiHotels).isDisplayed(); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 */
	public static String check1;

	By handlePop=By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']");	
	By clickLogin=By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");
	By clickHotel = By.linkText("Hotels");
	By hotelLocation = By.xpath("//span[@class='lbl_input latoBold  appendBottom5']");
	By clickLocation = By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']");
	By checkIn = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']");
	By checkOut = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected']");
	By searchHotel = By.id("hsw_search_button");
	By verifyPlaces = By.id("seoH1DontRemove");

	/*
	 * public Hotel(WebDriver driver1) { driver = driver1; }
	 */

	public void clickOnURL() throws IOException {
		//openBrowser("Chrome", "https://www.makemytrip.com/");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ldriver= new ChromeDriver();
	    ldriver.get("https://www.makemytrip.com/");
		System.out.println(ldriver);
	}

	public void clickOnHotel() throws InterruptedException {
		try{
			ldriver.findElement(handlePop).isDisplayed() ;
		
			Thread.sleep(3000);
			ldriver.findElement(clickLogin).click();
			Thread.sleep(3000);
			ldriver.findElement(clickHotel).click();
			Thread.sleep(3000);
		} catch(NoSuchElementException e) {
			ldriver.findElement(clickHotel).click();
			
		}

	}

	public void hotelLocationSearch() throws InterruptedException {
		Thread.sleep(1000);
		ldriver.findElement(hotelLocation).click();
	}

	public void clickOnLocation() throws InterruptedException {
		Thread.sleep(1000);
		WebElement name = ldriver.findElement(clickLocation);
		Thread.sleep(3000);
		name.sendKeys("Mumbai");
		Thread.sleep(5000);
		name.sendKeys(Keys.ARROW_DOWN);
		name.sendKeys(Keys.ENTER);
	}

	public void checkInAndOutDate() {
		WebElement checkInDate = ldriver.findElement(checkIn);

		WebElement checkOutDate = ldriver.findElement(checkOut);
		if (checkInDate.getAttribute("aria-selected").equalsIgnoreCase("true")
				&& checkOutDate.getAttribute("aria-selected").equalsIgnoreCase("true")) {
			checkInDate.click();
		}
		checkOutDate.click();
	}

	public void searchHotel() {
		ldriver.findElement(searchHotel).click();
	}

	public String verifyPlace() {
		WebElement check = ldriver.findElement(verifyPlaces);
		check1=check.getText();
		System.out.println("Text is present");
		return check1;
	}

	public void closeBrowser() {
		ldriver.close();
		ldriver.quit();
	}
}