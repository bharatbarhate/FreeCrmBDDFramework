package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import uimap.Contacts;
import uimap.Deals;
import uimap.LoginFreeCRM;
import uimap.LoginHomePage;

public class DealsStepDefination {

/*
	WebDriver driver;

	@Given("^User is on a Login Page of Free CRM$")
	public void user_is_on_a_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(LoginFreeCRM.baseUrl());
		driver.manage().window().maximize();
	}

	@When("^User sees a title of Login Page$")
	public void user_sees_a_title_of_Login_Page_as_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}
	
	 * Scenario Outline Code
	 
	@When("^user enters username as\"(.*)\" and password as\"(.*)\"$")
//	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String username, String password) {

		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.txtEmailAddress(driver))).isDisplayed();	
		try {
			LoginFreeCRM.txtEmailAddress(driver).clear();
			LoginFreeCRM.txtEmailAddress(driver).sendKeys(username);

			LoginFreeCRM.txtPassword(driver).clear();
			LoginFreeCRM.txtPassword(driver).sendKeys(password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 * Data Table code
	 
	@When("^user enters username as <username> and password as <password>$")
//	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.txtEmailAddress(driver))).isDisplayed();	
		try {
			LoginFreeCRM.txtEmailAddress(driver).clear();
			LoginFreeCRM.txtEmailAddress(driver).sendKeys(data.get(0).get(0));

			LoginFreeCRM.txtPassword(driver).clear();
			LoginFreeCRM.txtPassword(driver).sendKeys(data.get(0).get(1));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user clicks on login button of Free CRM$")
	public void user_clicks_on_login_button() {
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginFreeCRM.btnLogin(driver))).isDisplayed();		
		try {
			LoginFreeCRM.btnLogin(driver).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user is redirected on Home page of Free CRM$")
	public void user_is_redirected_on_Home_page() {

		//icnHome
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginHomePage.icnHome(driver))).isDisplayed();		

		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}
	@Then("^user clicks on Deals icon$")
	public void user_clicks_on_Deals_icon() {
		Deals.icnDealsBeforeSave(driver).click();
		System.out.println("Deals Icon");

	}

	@Then("^user clicks on New button$")
	public void user_clicks_on_New_button() {
		Deals.btnNew(driver).click();
	}
	
	 * Scenario Outline Code
	 
	@Then("^user enters Title as \"([^\"]*)\" and Stage as \"([^\"]*)\" and Status as \"([^\"]*)\"$")
	public void user_enters_Title_as_and_Stage_as_and_Status_as(String title, String stage, String status) throws InterruptedException {
		Deals.txtTitleDeals(driver).clear();
		Deals.txtTitleDeals(driver).sendKeys(title);
		
		Deals.cmbStageDeals(driver).sendKeys(stage);
		Thread.sleep(2000);
		Deals.cmbStageDeals(driver).sendKeys(Keys.ENTER);
		
		Deals.cmbStatusDeals(driver).sendKeys(status);
		Thread.sleep(2000);
		Deals.cmbStatusDeals(driver).sendKeys(Keys.ENTER);
	}
	
	
	 * Data Table Code
	 
	
	@Then("^user enters Title as <title> and Stage as <stage> and Status as <status>$")
	public void user_enters_Title_as_and_Stage_as_and_Status_as(DataTable dealDetails) throws InterruptedException {
		
		List<List<String>> data= dealDetails.raw();
		
		Deals.txtTitleDeals(driver).clear();
		Deals.txtTitleDeals(driver).sendKeys(data.get(0).get(0));
		
		Deals.cmbStageDeals(driver).sendKeys(data.get(0).get(1));
//		Deals.cmbStageDeals(driver).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		Deals.cmbStageDeals(driver).sendKeys(Keys.ENTER);
		
		Deals.cmbStatusDeals(driver).sendKeys(data.get(0).get(2));
//		Deals.cmbStatusDeals(driver).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		Deals.cmbStatusDeals(driver).sendKeys(Keys.ENTER);
	}

	@Then("^user clicks on Save button$")
	public void user_clicks_on_Save_button() {
		Deals.btnSave(driver).click();
	}

	@Then("^user clicks on Deals icon again to see deal has been stored sucessfully$")
	public void user_clicks_on_Deals_icon_again_to_see_deal_has_been_staored_sucessfully() throws InterruptedException {
		Thread.sleep(2000);
		Deals.icnContactsAfterSave(driver).click();
		Thread.sleep(5000);
		
	}
	
	@Then("^user Clicks on Settings icon and user selects Log Out Option and log out from system$")
	public void user_Clicks_on_Settings_icon_and_user_selects_Log_Out_Option_and_log_out_from_system() throws InterruptedException {

		Actions action =  new Actions(driver);
		action.click(Contacts.icnSettings(driver)).build().perform();

		Deals.icnSettings(driver).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(Deals.icnSettings_LogOff(driver, "Log Out")).build().perform();
		Thread.sleep(5000);

		Deals.icnSettings(driver).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(Deals.icnSettings(driver)).build().perform();
		Deals.icnSettings_LogOff(driver, "Log Out").click();
		
		Thread.sleep(5000);

		driver.quit();

	}*/
}
