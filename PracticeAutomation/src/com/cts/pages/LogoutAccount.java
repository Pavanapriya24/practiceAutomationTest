package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogoutAccount {
	
	public static By clickOnLogOutLoc = By.xpath("//a[text()='Logout']");
	public static By clickOnShopLoc = By.xpath("//a[text()='Shop']");
	 public static By clickOnHtmlLoc= By.linkText("HTML");
	 public static By selectSortLoc = By.name("orderby");
	 public static By clickOnBookLoc = By.xpath("//a[@data-product_id='181']");
	public static By clickOnIteamLoc=By.xpath("//span[text()='1 item']");
	private static By demositeLoc = By.linkText("Demo Site");
	
	public static void clickOnLogOut(WebDriver driver)
	{
		driver.findElement(clickOnLogOutLoc).click();
	}
	public static void clickOnShop(WebDriver driver)
	{
		driver.findElement(clickOnShopLoc).click();
	}
	public static void clickOnHtml(WebDriver driver)
	{
		driver.findElement(clickOnHtmlLoc).click();
	}
	public static void selectDropdown(WebDriver driver, String sortBy)
	{
		WebElement sorting = driver.findElement(selectSortLoc);
		Select sortByOrder = new Select(sorting);
		sortByOrder.selectByVisibleText(sortBy);
	}
	public static void clickOnBook(WebDriver driver)
	{
		driver.findElement(clickOnBookLoc).click();
	}
	public static void clickOnItem(WebDriver driver)
	{
		driver.findElement(clickOnIteamLoc).click();
	}
	public static void clickOnDemosite(WebDriver driver)
	{

		driver.findElement(demositeLoc).click();
		}
	
	
	

}
