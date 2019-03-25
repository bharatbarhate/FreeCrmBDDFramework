package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuOptions {
	public static WebElement txtTitleDeals(WebDriver driver)
	{
		return driver.findElement(By.name("title"));
	}
	public static WebElement icnDealsBeforeSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[text()='Deals']"));
	}
	//	public static WebElement icnHome(WebDriver driver){		return driver.findElement(By.xpath(""));}

	public static WebElement icnHome(WebDriver driver)
	{  
		return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Home')]"));
	}
	public static WebElement icnCalendar(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Calendar')]"));}
	public static WebElement icnContacts(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Contacts')]"));}
	public static WebElement icnCompanies(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Companies')]"));}
	public static WebElement icnDeals(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Deals')]"));}
	public static WebElement icnTasks(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Tasks')]"));}
	public static WebElement icnCases(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Cases')]"));}
	public static WebElement icnCalls(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Calls')]"));}
	public static WebElement icnDocuments(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Documents')]"));}
	public static WebElement icnEmail(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Email')]"));}
	public static WebElement icnCampaigns(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Campaigns')]"));}
	public static WebElement icnReports(WebDriver driver){  return driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Reports')]"));}

}
