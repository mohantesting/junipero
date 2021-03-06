package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import PageObjects.HotelsPage;
import io.cucumber.java.en.*;

/**
 * This class is the Step definition class for verifying whether results are for
 * Mumbai
 * 
 *
 */
public class HotelsPageStepDefinition {

	WebDriver driver = null;
	HotelsPage hp = new HotelsPage(driver);

	@Given("^user navigate to makemytrip$")
	public void user_navigate_to_makemytrip() throws Throwable {
		hp.clickOnURL();

	}

	@When("^user click on hotel$")
	public void user_click_on_hotel() throws Throwable {
		hp.clickOnHotel();
	}

	@And("^user search for location$")
	public void user_search_for_location() throws Throwable {
		Thread.sleep(2000);
		hp.hotelLocationSearch();
	}

	@And("^user enter mumbai location$")
	public void user_enter_mumbai_location() throws Throwable {
		hp.clickOnLocation();
	}

	@And("^user select date$")
	public void user_select_date() throws Throwable {
		hp.checkInAndOutDate();
	}

	@And("^user search for hotel in mumbai$")
	public void user_search_for_hotel_in_mumbai() throws Throwable {
		hp.searchHotel();
	}

	// VERIFYING THE RESULTS
	@SuppressWarnings("static-access")
	@Then("^user verify the result are getting displayed for mumbai location$")
	public void user_verify_the_result_are_getting_displayed_for_mumbai_location() throws Throwable {
		hp.verifyPlace();
		SoftAssert asser = new SoftAssert();
		asser.assertTrue(hp.check1.contains("Mumbai"));
		hp.closeBrowser();
		asser.assertAll();
	}

}
