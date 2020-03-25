package com.cts.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.BillingPage;
import com.cts.pages.CheckOutPage;
import com.cts.pages.DemoRegisterPage;
import com.cts.pages.LogoutAccount;
import com.cts.pages.MyAccount;
import com.cts.pages.RegisterAccount;
import com.cts.utils.ExcelUtils;

public class MainTest extends LaunchWebDriver {
	
	@DataProvider
	public String[][] practiceTest() throws IOException
	{
		String[][] data = ExcelUtils.getSheetIntoStringArray("resources/ExcelAutomation.xlsx",
				"RegisterData");
		return data;
	}
	

	
	 
	@Test(dataProvider = "practiceTest")
	public void placeOrderTest(String username, String password, String emailname,String loginpassword,String sortBy,String Firstname,String Lastname,String Company,
			String Email,String Phonenumber,String Address,String address2,String City,String state,String pincode,
			String firstName, String lastName, String address, String email, String num, String skill,
			String workCountry, String presentCountry, String birthYear, String birthMonth, String birthDay,
			String Password, String confirmPass) throws InterruptedException
	{
		Thread.sleep(1000);
		MyAccount.clickOnMyAccount(driver);
		RegisterAccount.enterUsername(driver,username );
		RegisterAccount.enterPassword(driver,password);
		Thread.sleep(1000);
		RegisterAccount.clickOnRegister(driver);
		
		LogoutAccount.clickOnLogOut(driver);
		RegisterAccount.enterEmail(driver, emailname);
		RegisterAccount.enterLoginPassword(driver, loginpassword);
		RegisterAccount.clickOnLogin(driver);
		LogoutAccount.clickOnShop(driver);
		LogoutAccount.clickOnHtml(driver);
		LogoutAccount.selectDropdown(driver, sortBy);
		LogoutAccount.clickOnBook(driver);
		LogoutAccount.clickOnItem(driver);
		CheckOutPage.clickOnCheckOut(driver);
		
		BillingPage.enterFirstName(driver, Firstname);
		BillingPage.enterlastName(driver,Lastname);
		BillingPage.enterCompany(driver,Company);
		BillingPage.enterEmail(driver,Email);
		BillingPage.enterPhoneNumber(driver,Phonenumber);
		BillingPage.enterAddress(driver,Address);
		BillingPage.enterAddress2(driver, address2);
		BillingPage.enterCity(driver,City);
		BillingPage.clickonStateSelectBox(driver);
		BillingPage.enterState(driver,state);
		BillingPage.clickOnState(driver);
		BillingPage.enterPincode(driver, pincode);
		BillingPage.clickOnPayment(driver);
		BillingPage.clickOnPlaceOrder(driver);
		
		

		
		LogoutAccount.clickOnDemosite(driver);

		// filling the form
		DemoRegisterPage.formFilling(driver, firstName, lastName, address, email, num, skill, workCountry,
		presentCountry, birthYear, birthMonth, birthDay, password, confirmPass);

	

		//LogoutAccount.clickOnLogOut(driver);
		
		
		
		
	}
}
		