package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	public WebDriver ldriver;
	
	public FlightsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="(//span[@class='chNavText darkGreyText'])[1]")
	WebElement Flights;
	
	@FindBy(xpath="//label[@for='fromCity']")
	WebElement FromTab;
	
	@FindBy(xpath="(//div[@class='calc60'])[1]")
	WebElement Mumbai;
	
	@FindBy(xpath="//label[@for='toCity']")
	WebElement ToTab;
	
	@FindBy(xpath="(//div[@class='calc60'])[1]")
	WebElement Delhi;
	
	@FindBy(xpath="//label[@for='departure']")
	WebElement DepartureTab;
	
	@FindBy(xpath="(//p[.='31'])[1]")
	WebElement thirtyOneAug;
	
	@FindBy(xpath="//a[.='Search']")
	WebElement SearchBtn;
	
	@FindBy(xpath="//button[.='OKAY, GOT IT!']")
	WebElement OkBtn;
	
	@FindBy(xpath="(//span[@class='box')[10]")
	WebElement NonStop;
	
	@FindBy(xpath="(//div[@class='appendBottom12 filterTimeSlots'])[2]")
	WebElement DepartureTime;
	
	@FindBy(xpath="(//button[@id=\"bookbutton-RKEY:83d3045e-e652-4a17-8a39-a9e9afa02542:18_0\"] )[1]")
	WebElement ViewPrices;
	
	@FindBy(xpath="(//button[@id='bookbutton-RKEY:70a7a8a9-48aa-4332-a172-f25dc82184db:20_0'])[2]")
	WebElement BookNow;
	
	@FindBy(xpath="(//span[@class='outer'])[1]")
	WebElement SecureMyTrip;
	
	@FindBy(xpath="(//span[@class='box'])[1]")
	WebElement ConfirmPassenger;
	
	@FindBy(xpath="(//span[@class='fontSize16 blackFont'])[2]")
	WebElement TotalAmountInFareSummary;
	
	@FindBy(xpath="(//p[@class=' blackText fontSize18 blackFont white-space-no-wrap'])[1]")
	WebElement TotalAmountInPreviousPage;
	
	
	public void clickFlights() {
		Flights.click();
	}
	 
	public void clickFromTab() throws InterruptedException {
		Thread.sleep(2000);
		FromTab.click();
	}
	
	public void clickMumbai() throws InterruptedException {
		Thread.sleep(1000);
		Mumbai.click();
	}
	
	public void clickToTab() throws InterruptedException {
		Thread.sleep(2000);
		ToTab.click();
	}
	
	public void clickDelhi() throws InterruptedException {
		Thread.sleep(1000);
		Delhi.click();
	}
	
	public void clickDepartureTab() throws InterruptedException {
		Thread.sleep(2000);
		DepartureTab.click();
	}
	
	public void clickDate() throws InterruptedException {
		Thread.sleep(1000);
		thirtyOneAug.click();
	}
	
	public void Search() {
		SearchBtn.click();
	}
	
	
	public void clickOk() {
		OkBtn.click();
	}
	
	public void clickNonStop() {
		NonStop.click();
	}
	
	public void clickDepartureTime() {
		DepartureTime.click();
	}
	
	public void clickViewPrices() {
		ViewPrices.click();
	}
	
	public void clickBookNow() throws InterruptedException {
		Thread.sleep(1000);
		BookNow.click();
		
	}
	
	public void clickSecureMyTrip() {
		SecureMyTrip.click();
	}
	
	public void clickConfirmPassenger() {
		ConfirmPassenger.click();
	}
	
	public String getTotalAmountInFarePage() {
		return ldriver.getTitle();
	}
	
	public String getTotalAmountInPreviousPage() {
		return ldriver.getTitle();
	}

	}


