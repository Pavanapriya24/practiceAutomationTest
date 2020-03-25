package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogoutAccount {
	
	private  By clickOnLogOutLoc = By.xpath("//a[text()='Logout']");
	private  By getCurrentTitleLoc = By.partialLinkText("My Account");
	
	
	private WebDriver driver;
	public LogoutAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void clickOnLogOut(WebDriver driver)
	{
		driver.findElement(clickOnLogOutLoc).click();
	}



	public  String getCurrentTitle(WebDriver driver) {
    String actual = driver.findElement(getCurrentTitleLoc).getText();
		return actual ;
	}
	
}
