package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage {

	public WebDriver ldriver;
	
	public HotelsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="(//span[@class='chNavText darkGreyText'])[2]")
	WebElement Hotels;
	
	@FindBy(xpath="//label[@for='city']")
	WebElement ForCity;
	
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-1-item-1']")
	WebElement Mumbai1;
	
	@FindBy(xpath="//button[@id='hsw_search_button']")
	WebElement Searchbutton;
	
	
	@FindBy(xpath="//p[.='Hotels, Villas, Apartments and more in Mumbai']")
	By MumbaiHotels;
	
	
	
	
	
	public void clickHotels() {
		Hotels.click();
	}
	
	
	public void clickForCity() {
		ForCity.click();
	}
	
	public void clickMumbai1() {
		Mumbai1.click();
	}
	
	public void clickSearch() {
		Searchbutton.click();
	}
	
	public boolean MumbaiTextExist() {
		return ldriver.findElement(MumbaiHotels).isDisplayed();
	}
	
	

	}


