package com.automationPractice.steps.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationPractice.pages.Home.HomePage;
import com.automationPractice.pages.Login.LoginPage;
import com.automationPractice.pages.my_account.MyAccountPage;
import com.automationPractice.utilites.AppProperties;
import com.automationPractice.utilites.CommonSteps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class LoginSteps extends CommonSteps 	 {
	
	private int timeOutInSeconds = 15;
	private WebDriver driver = getDriver();
	
	
//	private HomePage homePage = new HomePage(driver);
	LoginPage loginpage = new LoginPage(driver);
	private MyAccountPage myAccountPage = new MyAccountPage(driver);

		
		
	
	
	
	@And("^User navigates to home page$")
	public void usernavigetesToHomePage() {
		//driver.get(AppProperties.AUTOMATION_PRACTICE_BASE_URL);
		
		
	}
//	@When("User clicks on sign in link")
//	public void user_clicks_on_sign_in_link() {	
//		homePage.clickSignInLinck();
//		
//	}

	@And("User inputs email and password")
	public void user_inputs_email_and_password() {
	String email = "abc213@mailinator.com";
	String password = "abc1234";
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
	
	
	}
	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	loginpage.cilickHomeButton();
	   
	}

	@Then("User is on account page")
	public void useris_on_account_page() {
	String accountHeader = myAccountPage.getHeader();
    assertEquals("MY ACCOUNT", accountHeader);
	}
	
	@When("User inputs {string} email and {string} password")
	public void user_inputs_and(String email, String password) {
	    loginpage.enterEmail(email);
	    loginpage.enterPassword(password);
	}

	@Then("User should see error message {string}")
	public void user_should_see_error_message(String errorMessage) {
	  String actualErrorMessage = loginpage.getErrorMessage();
	  assertTrue("Error message", actualErrorMessage.contains(errorMessage));
	}

}

//git clone https://github.com/TechCentureAcademy/automationPracticeBddSchool.git
