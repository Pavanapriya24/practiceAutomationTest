package com.cts.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.LogoutAccount;
import com.cts.pages.MyAccount;
import com.cts.pages.RegisterAccount;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public WebDriver driver;
	@Given("User launch the browser with practiceautomationtestingPage")
	public void user_launch_the_browser_with_practiceautomationtestingPage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		System.out.println("Given");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://practice.automationtesting.in/");

	}

	@When("I click on my account and enter registerusername as {string} and registerpassword as {string}")
	public void i_click_on_my_account_and_enter_registerusername_as_and_registerpassword_as(String username, String password) {
	    
		MyAccount MyAccount = new MyAccount(driver);
		MyAccount.clickOnMyAccount(driver);
		RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.enterRegiUsername(driver, username);
	    RegisterAccount.enterRegiPassword(driver, password);
	}
	@When("click on register button")
	public void click_on_register_button() {
		RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.clickOnRegister(driver);
	}

	@Then("i get access to the practice automation")
	public void i_get_access_to_the_practice_automation() {
	  System.out.println("then");
	}

	

	@When("I click on my accoount and enter loginemail as {string} and loginpassword as {string}")
	public void i_click_on_my_accoount_and_enter_loginemail_as_and_loginpassword_as(String emailname, String loginpassword) {
		MyAccount MyAccount = new MyAccount(driver);
		MyAccount.clickOnMyAccount(driver);
		RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.enterLoginEmail(driver, emailname);
	    RegisterAccount.enterLoginPassword(driver, loginpassword);
	}

	@When("click on login icon")
	public void click_on_login_icon() {
		RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.clickOnLogin(driver);
	}

	@Then("i should get title as My Account")
	public void i_should_get_title_as_My_Account() {
		LogoutAccount LogoutAccount = new LogoutAccount(driver);
	    String actualTitle = LogoutAccount.getCurrentTitle(driver);
	    String expectedTitle = "My Account";
	    Assert.assertEquals(expectedTitle, actualTitle);  
	}
	
	

	@Then("I should get already used email")
	public void i_should_get_already_used_email() {
	    System.out.println("then");
	}

	@Then("I should get invalid username or password")
	public void i_should_get_invalid_username_or_password() {
		System.out.println("then");
	}

	@When("I click on my Account and enter loginemail as {string} and enter loginpassword as {string}")
	public void i_click_on_my_Account_and_enter_loginemail_as_and_enter_loginpassword_as(String emailname, String loginpassword) {
	   MyAccount MyAccount = new MyAccount(driver);
		MyAccount.clickOnMyAccount(driver);
	    RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.enterLoginEmail(driver, emailname);
	    RegisterAccount.enterLoginPassword(driver, loginpassword);
	}

	@When("click on login button")
	public void click_on_login_button() {
		RegisterAccount RegisterAccount = new RegisterAccount(driver);
	    RegisterAccount.clickOnLogin(driver);
	}

	@Then("I should get access to the practice automation page")
	public void i_should_get_access_to_the_practice_automation_page() {
	   System.out.println("then");
	}


}