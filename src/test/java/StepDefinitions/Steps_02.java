package StepDefinitions;

import org.junit.Assert;

import com.qa.factory.DriverFactory;


import PageObjects.HotelsPage;
import io.cucumber.java.en.*;

public class Steps_02 {
	

	private HotelsPage hg =new HotelsPage(DriverFactory.getDriver());

	
	
	
	@Then("Select location as Mumbai.")
	public void select_location_as_mumbai() {
	   hg.clickHotels();
	   hg.clickForCity();
	   hg.clickMumbai1();
	}

	@Then("Search for Hotels in Mumbai.")
	public void search_for_hotels_in_mumbai() {
	    hg.clickSearch();
	}

	@And("Verify whether the results are getting displayed for Mumbai Location.")
	public void verify_whether_the_results_are_getting_displayed_for_mumbai_location() {
	    Assert.assertTrue(hg.MumbaiTextExist());
	}

}
