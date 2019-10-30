package com.automationPracticeLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationPractice.utilites.AppProperties;
import com.automationPractice.utilites.DriverFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps extends DriverFactory {
	//private WebDriver driver;
	private int timeOutInSeconds = 15;
//	public LoginSteps() {
	//	if (driver == null)
		//	driver = getDriver(AppProperties.BROWSER_TYPE);
	//}
		
		
	
	
	
	@And("^User navigates to home page$")
	public void usernavigetesToHomePage() {
		driver.get(AppProperties.AUTOMATION_PRACTICE_BASE_URL);
		
		
	}
	@When("User clicks on sign in link")
	public void user_clicks_on_sign_in_link() {	
		driverHelper.click(By.linkText("Sign in"), timeOutInSeconds);
		
	}

	@And("User inputs email and password")
	public void user_inputs_email_and_password() {
		
	driverHelper.sendKeys(By.id("email"), "abc213@mailinator.com", timeOutInSeconds);
	driverHelper.sendKeys(By.id("passwd"), "abc1234", timeOutInSeconds);
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	   driverHelper.click(By.id("SubmitLogin"), timeOutInSeconds);
	   
	}

	@Then("User is on account page")
	public void useris_on_account_page() {
	String accountHeader = driverHelper.getText(By.tagName("h1"), timeOutInSeconds);
Assert.assertEquals("MY ACCOUNT", accountHeader);
	}

}

//git clone https://github.com/TechCentureAcademy/automationPracticeBddSchool.git
