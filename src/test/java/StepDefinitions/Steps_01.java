package StepDefinitions;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.factory.DriverFactory;

import PageObjects.FlightsPage;

import io.cucumber.java.en.*;


public class Steps_01 {
	
	public static String TotalAmountReviewPage;
	public static String TotalAmountSummaryPage;
	private FlightsPage fg =new FlightsPage(DriverFactory.getDriver());

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		//private FlightsPagesPage fg =new FlightsPagesPage(DriverFactory.getDriver()); 
	
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		DriverFactory.getDriver().get(string);   
	}

	@When("Search for Flight from Mumbai to Delhi")
	public void search_for_flight_from_mumbai_to_delhi() throws InterruptedException {
		/*
		 * fg.clickFlightsPages() Thread.sleep(1000); fg.clickFromTab();
		 * fg.clickFromTab(); fg.clickMumbai(); fg.clickToTab(); fg.clickDelhi();
		 */
		fg.searchPlace();
		fg.departurePlace();
		fg.arrivalPlace();
		
	}
	
	
	 
	
	@When("Select Departure date of tommorow")
	public void select_departure_date_of_tommorow() throws InterruptedException {
//     //fg.clickDepartureTab();
//     fg.clickDate();
//     fg.Search();
		fg.departureDate();
		fg.clickOnSearchFlight();
	}

	
	@When("Select Non Stop from Stops from Mumbai option")
	public void select_non_stop_from_stops_from_mumbai_option() throws InterruptedException {
	    //fg.clickNonStop();
		fg.clickOnNonstop();
	}

	
	  @When("Select 6AM-12PM in Departure from Mumbai option") 
	  public void select_6am_12pm_in_departure_from_mumbai_option() throws InterruptedException
	  {
	 
	  //fg.clickDepartureTime(); }
		  fg.checkflightTime();
	  }
	 

	@When("Click on the view prices button of the airline which show the lowest price value")
	public void click_on_the_view_prices_button_of_the_airline_which_show_the_lowest_price_value() throws InterruptedException {
	
//		Thread.sleep(1000);
//	   fg.clickViewPrices();
		fg.clickOnViewPrice();
	    
	}

    @ When("Select the Book now button which has the lowest value from the options available")
	public void select_the_book_now_button_which_has_the_lowest_value_from_the_options_available() throws InterruptedException {
	    fg.clickOnBookNow();
	    fg.switchTabs();
	    
	}

	@And("user enter travellerdetails")
	public void user_enter_travellerdetails() throws Throwable {

		fg.travellerDetails();
	}
	//Verify my account
	@Then("verify amount")
	public void verify_amount() throws Throwable {

//		Assert.assertEquals("Prices are not equal at Review and Summary Page... Review Amount = " + FlightsPage.TotalAmountReviewPage + "while total amount = " + FlightsPage.TotalAmountSummaryPage,true  ,FlightsPage.TotalAmountReviewPage.equals(FlightsPage.TotalAmountSummaryPage));
//		fg.closeBrowser();
		SoftAssert sa= new SoftAssert();
//		Assert.assertEquals("Prices are not equal at Review and Summary Page... Review Amount = " + FlightsPage.TotalAmountReviewPage + "while total amount = " + FlightsPage.TotalAmountSummaryPage,true  ,FlightsPage.TotalAmountReviewPage.equals(FlightsPage.TotalAmountSummaryPage));
		sa.assertEquals(TotalAmountReviewPage, TotalAmountSummaryPage, "test is passed");
		fg.closeBrowser();
		sa.assertAll();
	}
}



