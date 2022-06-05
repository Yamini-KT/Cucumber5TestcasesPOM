package com.steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class BasePageSteps extends AbstractPageSteps{

	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = getDriver();
	}

	
	@Given("user goes to url {string}")
	public void user_goes_to(String url) throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		closeDriver();
	}

}
