package StepDefinitions;

import org.junit.Assert;

import com.qa.factory.DriverFactory;

import PageObjects.FlightsPage;
import io.cucumber.java.en.*;

public class Steps_01 {
	
	private static String expectedtitle;
	private FlightsPage fg =new FlightsPage(DriverFactory.getDriver());

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		//private FlightsPage fg =new FlightsPage(DriverFactory.getDriver()); 
	
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		DriverFactory.getDriver().get(string);   
	}

	@When("Search for Flight from Mumbai to Delhi")
	public void search_for_flight_from_mumbai_to_delhi() throws InterruptedException {
		fg.clickFlights();
	   fg.clickFromTab();
	   fg.clickMumbai();
	   fg.clickToTab();
	   fg.clickDelhi();
	   
	   
	   
	}

	@When("Select Departure date of tommorow")
	public void select_departure_date_of_tommorow() throws InterruptedException {
     fg.clickDepartureTab();
     fg.clickDate();
     fg.Search();
	}

	
	@When("Select Non Stop from Stops from Mumbai option")
	public void select_non_stop_from_stops_from_mumbai_option() throws InterruptedException {
	    fg.clickNonStop();
	    fg.clickDepartureTab();
	    fg.clickDepartureTime();
	}

	@When("Select 6AM-12PM in Departure from Mumbai option")
	public void select_6am_12pm_in_departure_from_mumbai_option() throws InterruptedException {
		 fg.clickDepartureTab();
		    fg.clickDepartureTime();
	}

	@When("Click on the view prices button of the airline which show the lowest price value")
	public void click_on_the_view_prices_button_of_the_airline_which_show_the_lowest_price_value() {
		String expectedtitle = fg.getTotalAmountInPreviousPage();
	    fg.clickViewPrices();
	    
	}

	@When("Select the Book now button which has the lowest value from the options available")
	public void select_the_book_now_button_which_has_the_lowest_value_from_the_options_available() throws InterruptedException {
	    fg.clickBookNow();
	}

	@When("Enter the passenger detail and select the secure my trip checkbox")
	public void enter_the_passenger_detail_and_select_the_secure_my_trip_checkbox() {
	    fg.clickSecureMyTrip();
	    
	}

	@Then("Confirm the passenger and capture the Total Amount Displayed on Fare Summary detail.")
	public void confirm_the_passenger_and_capture_the_total_amount_displayed_on_fare_summary_detail() {
	    expectedtitle= fg.getTotalAmountInFarePage();
	    System.out.println("Total Amount in fare Page is"+expectedtitle);
	}

	@Then("Verify that the value that was appearing on the previous page and review detail page")
	public void verify_that_the_value_that_was_appearing_on_the_previous_page_and_review_detail_page() {
		//String expectedtitle= fg.getTotalAmountInFarePage();
	    //System.out.println("Total Amount in fare Page is"+expectedtitle);
	    String actualtitle = fg.getTotalAmountInPreviousPage();
	    System.out.println("Total Amount in Previous Page is"+actualtitle);
	    Assert.assertTrue(actualtitle.contains(expectedtitle));
	}

	

}
