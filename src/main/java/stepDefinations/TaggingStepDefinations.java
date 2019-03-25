package stepDefinations;

import java.awt.Menu;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import uimap.Deals;
import uimap.LoginFreeCRM;
import uimap.LoginHomePage;
import uimap.MenuOptions;

public class TaggingStepDefinations {
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(LoginFreeCRM.baseUrl());
		driver.manage().window().maximize();

	}
	@After
	public void tearDown()
	{
		System.out.println("Final tear down. This is removed from log off and added it under tearDown");
		driver.quit();
	}

	@Given("^User is on a Login Page of FreeCRM$")
	public void user_is_on_a_Login_Page_of_FreeCRM() {

/*		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(LoginFreeCRM.baseUrl());
		driver.manage().window().maximize();
*/
		System.out.println("Commented login code and added it under Before tag");
	}

	@When("^User sees a title of Login Screen$")
	public void user_sees_a_title_of_Login_Screen() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}

	@When("^user clicks on login button of FreeCRM$")
	public void user_clicks_on_login_button_of_FreeCRM() {
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.btnLogin(driver))).isDisplayed();		

		LoginFreeCRM.btnLogin(driver).click();

	}

	@Then("^user is redirected on Home page of FreeCRM$")
	public void user_is_redirected_on_Home_page_of_FreeCRM() {
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginHomePage.icnHome(driver))).isDisplayed();		

		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}

	@Then("^user clicks on Calendar icon$")
	public void user_clicks_on_Calendar_icon() {
		MenuOptions.icnCalendar(driver).click();

	}

	@Then("^user Clicks on Settings icon and user selects Log Out Option and logs out from system$")
	public void user_Clicks_on_Settings_icon_and_user_selects_Log_Out_Option_and_logs_out_from_system() {
		
		Actions action = new Actions(driver);
		action.click(Deals.icnSettings(driver)).build().perform();
		Deals.icnSettings_LogOff(driver, "Log Out").click();



	}

	@When("^user enters username as (.*) and password as (.*) on FreeCRM$")
	public void user_enters_username_as_and_password_as_on_FreeCRM(String username, String abb,DataTable credentials) {
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.txtEmailAddress(driver))).isDisplayed();	
		
		for(Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			
			LoginFreeCRM.txtEmailAddress(driver).sendKeys(data.get("username"));
			LoginFreeCRM.txtPassword(driver).sendKeys(data.get("password"));

		}
	}
	
	@Then("^user clicks on Companies icon$")
	public void user_clicks_on_Companies_icon() {
		MenuOptions.icnCompanies(driver).click();

	}

/*	@When("^user enters username as (.*)  and password as (.*) on FreeCRM$")
	public void user_enters_username_as_and_password_as_on_FreeCRM(DataTable credentials) {

		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc).
		// Field names for YourType must match the column names in 
		// your feature file (except for spaces and capitalization).
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.txtEmailAddress(driver))).isDisplayed();	
		
		for(Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			
			LoginFreeCRM.txtEmailAddress(driver).sendKeys(data.get("username"));
			LoginFreeCRM.txtPassword(driver).sendKeys(data.get("password"));

		}
	}*/

	@Then("^user clicks on Tasks icon$")
	public void user_clicks_on_Tasks_icon() {
		MenuOptions.icnTasks(driver).click();

	}

	@Then("^user clicks on Cases icon$")
	public void user_clicks_on_Cases_icon() {
		MenuOptions.icnCases(driver).click();
	}

	@Then("^user clicks on Calls icon$")
	public void user_clicks_on_Calls_icon() {
		MenuOptions.icnCalls(driver).click();

	}

	@Then("^user clicks on Documents icon$")
	public void user_clicks_on_Documents_icon() {
		MenuOptions.icnDocuments(driver).click();

	}

	@Then("^user clicks on Email icon$")
	public void user_clicks_on_Email_icon() {
		MenuOptions.icnEmail(driver).click();

	}

	@Then("^user clicks on Campaigns icon$")
	public void user_clicks_on_Campaigns_icon() {
		MenuOptions.icnCampaigns(driver).click();

	}

	@Then("^user clicks on Reports icon$")
	public void user_clicks_on_Reports_icon() {
		MenuOptions.icnReports(driver).click();

	}
}
