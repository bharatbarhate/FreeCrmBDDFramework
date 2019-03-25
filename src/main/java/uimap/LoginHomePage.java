package uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHomePage {
	//i[@class='home icon']

	public static WebElement icnHome(WebDriver driver)
	{
		return driver.findElement(By.xpath("//i[@class='home icon']"));
	}
}
