package com.cts.pages;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class LogoutAccount {
	
	private  By clickOnLogOutLoc = By.xpath("//a[text()='Logout']");
	//private By myTitleLoc = By.linkText("My Account – Automation Practice Site");
	
	
	
	private WebDriver driver;
	public LogoutAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void clickOnLogOut(WebDriver driver)
	{
		driver.findElement(clickOnLogOutLoc).click();
	}
	public String getCurrentTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public void screenShot() {
		Date date = new  Date();
		String dateStr = date.toString().replace(":", "-");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image_" + dateStr + ".png"));
		driver.quit();
	}
	
}
