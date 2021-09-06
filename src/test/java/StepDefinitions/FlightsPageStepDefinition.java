package StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import PageObjects.FlightsPage;
import io.cucumber.java.en.*;

/**
 * The class is the Step definition class for verifying amounts in flight page
 * 
 */
public class FlightsPageStepDefinition {

	public static String TotalAmountReviewPage;
	public static String TotalAmountSummaryPage;

	WebDriver driver = null;
	FlightsPage fg = new FlightsPage(driver);

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws IOException {

		fg.clickOnURL();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) throws IOException {

	}

	@And("Search for Flight from Mumbai to Delhi")
	public void search_for_flight_from_mumbai_to_delhi() throws InterruptedException {

		fg.searchPlace();
		fg.departurePlace();
		fg.arrivalPlace();

	}

	@And("Select Departure date of tommorow")
	public void select_departure_date_of_tommorow() throws InterruptedException {

		fg.departureDate();
		fg.clickOnSearchFlight();
	}

	@And("Select Non Stop from Stops from Mumbai option")
	public void select_non_stop_from_stops_from_mumbai_option() throws InterruptedException {
		fg.clickOnNonstop();
	}

	@And("Select 6AM-12PM in Departure from Mumbai option")
	public void select_6am_12pm_in_departure_from_mumbai_option() throws InterruptedException {
		fg.checkflightTime();
	}

	@And("Click on the view prices button of the airline which show the lowest price value")
	public void click_on_the_view_prices_button_of_the_airline_which_show_the_lowest_price_value()
			throws InterruptedException {
		fg.clickOnViewPrice();

	}

	@And("Select the Book now button which has the lowest value from the options available")
	public void select_the_book_now_button_which_has_the_lowest_value_from_the_options_available()
			throws InterruptedException {
		fg.clickOnBookNow();
		fg.switchTabs();

	}

	@And("user enter travellerdetails")
	public void user_enter_travellerdetails() throws Throwable {

		fg.travellerDetails();
	}

	// verifying the amount present in review page and previous page
	@Then("verify amount")
	public void verify_amount() throws Throwable {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(TotalAmountReviewPage, TotalAmountSummaryPage, "test is passed");
		fg.closeBrowser();
		sa.assertAll();
	}
}
