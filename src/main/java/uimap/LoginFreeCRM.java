package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFreeCRM {

	public static String baseUrl()
	{
		String url;
		return url = "https://ui.cogmento.com/";		
	}
	public static WebElement txtEmailAddress(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
	}
	public static WebElement rdbMode(WebDriver driver, String mode)
	{
		return driver.findElement(By.xpath("//input[@type='radio' and @id='"+mode+"']"));
	}
	public static WebElement chkPremiumCustomer(WebDriver driver)
	{
		return driver.findElement(By.id("premium"));
	}
	public static WebElement btnLogin(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[(text()='Login')]"));
	}
	public static WebElement txtPassword(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}

}
