package com.cts.stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.LogoutAccount;
import com.cts.pages.MyAccount;
import com.cts.pages.RegisterAccount;
import com.cts.utils.ExcelUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public WebDriver driver;

	@After
	public void afterScenario()
	{
		driver.quit();
	}
	
	@Given("User launch the browser with practiceautomationtestingPage")
	public void user_launch_the_browser_with_practiceautomationtestingPage() {
	    //launch the page
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		System.out.println("Given");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://practice.automationtesting.in/");

	}

	@When("I click on my account and enter registerusername as {string} and registerpassword as {string}")
	public void i_click_on_my_account_and_enter_registerusername_as_and_registerpassword_as(String username, String password) {
		//object for constructor
		MyAccount Account = new MyAccount(driver);
		//click on my account
		Account.clickOnMyAccount(driver);
		//object for constructor
		RegisterAccount Register = new RegisterAccount(driver);
		//enter register username
	    Register.enterRegiUsername(driver, username);
	    //enter register password
	    Register.enterRegiPassword(driver, password);
	}

	@When("click on register button")
	public void click_on_register_button() {
		//object for constructor
		RegisterAccount Register= new RegisterAccount(driver);
		//click on register icon
	    Register.clickOnRegister(driver);
	}
	@When("click on logout button")
	public void click_on_logout_button() {
	   LogoutAccount log = new LogoutAccount(driver);
	   log.clickOnLogOut(driver);
	   log.screenShot();
	}

	@Then("i get access to the practice automation testing page")
	public void i_get_access_to_the_practice_automation_testing_page() {
	    System.out.println("Practice automation page");
	}

    @When("I enter  login details from Excel {string} with SheetName {string} and click on login")
	public void i_enter_login_details_from_Excel_with_SheetName_and_click_on_login(String fileDeatils, String sheetName) throws IOException {
    	String str[][] = ExcelUtils.getSheetIntoStringArray("src/test/resources/Excel.xlsx",
    			 "LoginValid");
    			//object for constructor
    			MyAccount Account = new MyAccount(driver);
    			//click on my account
    			Account.clickOnMyAccount(driver);
    			//object for constructor
    			RegisterAccount Register = new RegisterAccount(driver);
    			//enter email 
    		    Register.enterLoginEmail(str[0][0]);
    		    //enter password
    		    Register.enterLoginPassword(str[0][1]);
    		    //click on login
    		    Register.clickOnLogin(driver);
	}

    @Then("I should access to the portal with title")
    public void i_should_access_to_the_portal_with_title() {
        String pageSource = driver.getPageSource();
        boolean check = pageSource.contains("My Account – Automation Practice Site");
        Assert.assertTrue("PASSED", check);
    }

	@When("I click on my account and enter already used  registerusername as {string} and registerpassword as {string}")
	public void i_click_on_my_account_and_enter_already_used_registerusername_as_and_registerpassword_as(String username, String password) {
		        //object for constructor
				MyAccount Account = new MyAccount(driver);
				//click on my account
				Account.clickOnMyAccount(driver);
				//object for constructor
				RegisterAccount Register = new RegisterAccount(driver);
				//enter register username
			    Register.enterRegiUsername(driver, username);
			    //enter register password
			    Register.enterRegiPassword(driver, password);
	}

	@When("click on register")
	public void click_on_register() {
		        //object for constructor
				RegisterAccount Register = new RegisterAccount(driver);
				//click on register icon
			    Register.clickOnRegister(driver);
	}

	@Then("I should get error message")
	public void i_should_get_error_message() {
		
	   System.out.println("email is already used");
	}

	

	@When("I click on my accoount and enter loginemail as {string} and left blank loginpassword as {string}")
	public void i_click_on_my_accoount_and_enter_loginemail_as_and_left_blank_loginpassword_as(String emailname, String loginpassword) {
		//object for constructor
		MyAccount Account = new MyAccount(driver);
		//click on my account
	    Account.clickOnMyAccount(driver);
		//object for constructor
		RegisterAccount Register = new RegisterAccount(driver);
		//enter email
		Register.enterLoginEmail(emailname);
		//password should left blank
		Register.enterLoginPassword(loginpassword);
	}

	@When("click on login button")
	public void click_on_login_button() {
		//object for constructor
        RegisterAccount Register = new RegisterAccount(driver); 
        //click on login 
        Register.clickOnLogin(driver);
        
	}

	@Then("I should get error message should be displayed as {string}")
	public void i_should_get_error_message_should_be_displayed_as(String string) {
		//object for constructor
		RegisterAccount Register = new RegisterAccount(driver);
		//error message
		Register.errormessage();
		String actualmessage = Register.errormessage();
		String expectedmessage = ("Error: Password is required.");
		// assert error message
		Assert.assertEquals(actualmessage, expectedmessage);
		//screenshot
		 LogoutAccount log = new LogoutAccount(driver);
		 log.screenShot();
	    
	}

	
	@When("I click on my Account and enter loginemail as {string} and enter loginpassword as {string} and click on login")
	public void i_click_on_my_Account_and_enter_loginemail_as_and_enter_loginpassword_as_and_click_on_login(String emailname, String loginpassword) {
		        //object for constructor
				MyAccount Account = new MyAccount(driver);
				//click on my account
			    Account.clickOnMyAccount(driver);
				//object for constructor
				RegisterAccount Register = new RegisterAccount(driver);
				//enter email
				Register.enterLoginEmail(emailname);
				//enter password
				Register.enterLoginPassword(loginpassword);
				//object for constructor
		        RegisterAccount register = new RegisterAccount(driver); 
		        //click on login 
		        register.clickOnLogin(driver);
	}

	

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    System.out.println("The password you entered for the username priyatatarao09@gmail.com is incorrect");
	}




}