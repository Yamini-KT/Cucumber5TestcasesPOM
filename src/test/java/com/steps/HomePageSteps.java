package com.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.salesforce.pages.home.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends AbstractPageSteps {
	
	WebDriver driver = getDriver();
	HomePage homepage = new HomePage(driver);
	
	
	@Then("home tab should be displayed as {string}")
	public void page_title_should_be_displayed_as(String expected) {		
		HomePage homepage = new HomePage(driver);
		String actual = homepage.getHomeTabText();
		homepage.logout();
		Assert.assertEquals(actual, expected);
	}
	
	@When("user clicks on logout button under profile after successful login")
	public void user_clicks_on_logout_button_under_profile_after_successful_login() {
	   homepage.logout();
	}
	
	@Then("user navigation menu items should contain {string}")
	public void user_navigation_menu_items_should_contain(String expected) {
		String actual = homepage.getUserNavMenuItems();
		Assert.assertTrue(actual.contains(expected));

	}
	

}
