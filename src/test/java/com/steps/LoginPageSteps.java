package com.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.salesforce.pages.login.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends AbstractPageSteps {
	
	WebDriver driver = getDriver();
	LoginPage loginpage = new LoginPage(driver);
			
	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String username) {
		loginpage.enterUsername(username);
	}
	
	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String password) {
		loginpage.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage.clickLoginButton();
	}
	
	@When("user clicks on RememberMe button")
	public void user_clicks_on_remember_me_button() {
		loginpage.selectRememberMe();
	}
	
	@When("user clicks forgotpassword button")
	public void user_clicks_forgotpassword_button() {
		loginpage.clickForgotPassword();
	}

	@Then("error message should be {string}")
	public void error_message_should_be(String expected) {
		String actual = loginpage.getLoginErrorMsg();
		Assert.assertEquals(actual, expected);
	}
	
	@Then("username field should display {string} in the login page")
	public void username_field_should_display_in_the_login_page(String expected) {
	    String actual = loginpage.getReloginUsername();
	    Assert.assertEquals(actual, expected);
	}

}
