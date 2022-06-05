package com.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.salesforce.pages.forgotpwd.ForgotPasswordPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordPageSteps extends AbstractPageSteps {

	WebDriver driver = getDriver();
	ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage(driver);


	@When("user enters {string} in forgot password page username field")
	public void user_enters_in_forgot_password_page_username_field(String username) {
		forgotpasswordpage.enterUsername(username);
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		forgotpasswordpage.clickContinueButton();
	}

	@Then("forgot password form message should be {string}")
	public void forgot_password_form_message_should_be(String expected) {
		String actual = forgotpasswordpage.getForgotPwdFormMsg();
		Assert.assertEquals(actual, expected);
	}
}
