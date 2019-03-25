package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contacts {

	
	public static WebElement txtEmailAddress(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
	}
	public static WebElement icnContactsBeforeSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[text()='Contacts']"));
	}
	public static WebElement icnContactsAfterSave(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[@href='/contacts']"));
	}
	public static WebElement btnNew(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class='ui linkedin button']/../a[@href='/contacts/new']"));
	}
	public static WebElement txtFirstName(WebDriver driver)
	{
		return driver.findElement(By.name("first_name"));
	}
	public static WebElement txtMiddleName(WebDriver driver)
	{
		return driver.findElement(By.name("middle_name"));
	}
	public static WebElement txtLastName(WebDriver driver)
	{
		return driver.findElement(By.name("last_name"));
	}

	public static WebElement rdbMode(WebDriver driver, String mode)
	{
		return driver.findElement(By.xpath("//input[@type='radio' and @id='"+mode+"']"));
	}
	public static WebElement txtCompany(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@name='company']/input"));
	}

	public static WebElement txtEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[@class='ui label label right corner']/following::input[@name='value' and @type='text'])[1]"));
	}

	public static WebElement txtStreet(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Street Address']"));
	}
	public static WebElement txtCity(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='City']"));
	}
	public static WebElement txtState(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='State / County']"));
	}
	public static WebElement txtZipCode(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
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
