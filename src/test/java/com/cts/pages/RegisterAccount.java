package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

	private  By enterRegisterUsenameLoc = By.id("reg_email");
	private  By enterRegisterPasswordLoc = By.id("reg_password");
	private  By clickonRegisterLoc = By.xpath("//input[@value='Register']");
	private  By enteremailLoc = By.id("username");
	private  By enterPassowrdLoc = By.id("password");
	private  By clickonLoginLoc = By.xpath("//input[@name='login']");
	
	private WebDriver driver;
	public RegisterAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void enterRegiUsername(WebDriver driver, String username)
	{
		driver.findElement(enterRegisterUsenameLoc).sendKeys(username);
	}
	public  void enterRegiPassword(WebDriver driver, String password)
	{
		driver.findElement(enterRegisterPasswordLoc).sendKeys(password);
	}

	public  void clickOnRegister(WebDriver driver)
	{
		driver.findElement(clickonRegisterLoc).click();
	}
	public  void enterLoginEmail(WebDriver driver, String emailname)
	{
		driver.findElement(enteremailLoc).sendKeys(emailname);
	}
	public  void enterLoginPassword(WebDriver driver, String loginpassword)
	{
		driver.findElement(enterPassowrdLoc).sendKeys(loginpassword);
	}
	public  void clickOnLogin(WebDriver driver)
	{
		driver.findElement(clickonLoginLoc).click();
	}
	
}

	
	
			

