package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Deals {

	public static WebElement txtTitleDeals(WebDriver driver)
	{
		return driver.findElement(By.name("title"));
	}
	public static WebElement icnDealsBeforeSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[text()='Deals']"));
	}
	public static WebElement icnContactsAfterSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[@href='/deals']"));
	}
	public static WebElement btnNew(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class='ui linkedin button']/../a[@href='/deals/new']"));
	}
	public static WebElement cmbStageDeals(WebDriver driver)
	{
		return driver.findElement(By.name("stage"));
	}
	public static WebElement cmbStatusDeals(WebDriver driver)
	{
		return driver.findElement(By.name("status"));
	}
	

	public static WebElement rdbMode(WebDriver driver, String mode)
	{
		return driver.findElement(By.xpath("//input[@type='radio' and @id='"+mode+"']"));
	}
	public static WebElement cmbCountry(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@name='country' and @role ='combobox']/input"));
	}
	public static WebElement btnSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
	}
	public static WebElement icnSettings(WebDriver driver)
	{
		//return driver.findElement(By.xpath("//a[@role='option']/span[contains(text(),'"+option+"')]"));
		return driver.findElement(By.xpath("(//i[@class='settings icon'])[1]"));
	}
	public static WebElement icnSettings_LogOff(WebDriver driver, String option)
	{
	//	return driver.findElement(By.xpath("//a[@role='option']/span[contains(text(),'"+option+"')]"));
		//i[@class="power icon"]/following :: span[text()='Log Out']
		return driver.findElement(By.xpath("//i[@class=\"power icon\"]/following :: span[text()='Log Out']"));
	}
}
