package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import uimap.Contacts;
import uimap.LoginFreeCRM;
import uimap.LoginHomePage;

@SuppressWarnings("deprecation")
public class LoginStepDefination {

	WebDriver driver;

	@Given("^User is on a Login Page$")
	public void user_is_on_a_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(LoginFreeCRM.baseUrl());
		driver.manage().window().maximize();
	}

	@When("^User sees a title of Login Page as CRM$")
	public void user_sees_a_title_of_Login_Page_as_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}
	@When("^user enters username as \"(.*)\" and password as \"(.*)\"$")
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

	@When("^user clicks on login button$")
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

	@Then("^user is redirected on Home page$")
	public void user_is_redirected_on_Home_page() {

		//icnHome
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(LoginHomePage.icnHome(driver))).isDisplayed();		

		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM");

	}
	@Then("^user clicks on Contacts page$")
	public void user_clicks_on_Contacts_page() {
		Contacts.icnContactsBeforeSave(driver).click();
	}

	@Then("^user clicks on New button on Contacts page$")
	public void user_clicks_on_New_button_on_Contacts_page() {
		Contacts.btnNew(driver).click();
	}

	@Then("^user enters First Name as \"([^\"]*)\" and Middle Name as \"([^\"]*)\" and Last Name as \"([^\"]*)\"$")
	public void user_enters_First_Name_as_and_Middle_Name_as_and_Last_Name_as(String firstname, String middlename, String lastname) {
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Contacts.btnSave(driver))).isDisplayed();
		
		Contacts.txtFirstName(driver).clear();
		Contacts.txtFirstName(driver).sendKeys(firstname);
		
		Contacts.txtMiddleName(driver).clear();
		Contacts.txtMiddleName(driver).sendKeys(middlename);
		
		Contacts.txtLastName(driver).clear();
		Contacts.txtLastName(driver).sendKeys(lastname);
		
	}

	@Then("^user enters Company as \"([^\"]*)\" and Email as \"([^\"]*)\"$")
	public void user_enters_Company_as_and_Email_as(String company, String email) {
	//	Contacts.txtCompany(driver).clear();
		Contacts.txtCompany(driver).sendKeys(company);
		
		Contacts.txtEmail(driver).clear();
		Contacts.txtEmail(driver).sendKeys(email);

	}

	@Then("^user enters Street as \"([^\"]*)\" and City as \"([^\"]*)\" and State as \"([^\"]*)\" and Zip as \"([^\"]*)\" and Country as \"([^\"]*)\"$")
	public void user_enters_Street_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(String street,String city, String state, String zip, String country) throws InterruptedException {
		
		Contacts.txtStreet(driver).clear();
		Contacts.txtStreet(driver).sendKeys(street);

		Contacts.txtCity(driver).clear();
		Contacts.txtCity(driver).sendKeys(city);
		
		Contacts.txtState(driver).clear();
		Contacts.txtState(driver).sendKeys(state);

		Contacts.txtZipCode(driver).clear();
		Contacts.txtZipCode(driver).sendKeys(zip);

//		Contacts.cmbCountry(driver).clear();
		Contacts.cmbCountry(driver).sendKeys(country);
		Contacts.cmbCountry(driver).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		Contacts.cmbCountry(driver).sendKeys(Keys.ENTER);
		
/*		Select select = new Select(Contacts.cmbCountry(driver));
		select.selectByValue(country);*/
	}

	@Then("^user Clicks on Save button\\.$")
	public void user_Clicks_on_Save_button() {
		Contacts.btnSave(driver).click();
	}

	@Then("^user Clicks on Contacts icon\\.$")
	public void user_Clicks_on_Contacts_icon() throws InterruptedException {
		Thread.sleep(5000);
		Contacts.icnContactsBeforeSave(driver).click();
		Thread.sleep(5000);
	}

	@Then("^user Clicks on Settings icon\\.$")
	public void user_Clicks_on_Settings_icon() {
//		Contacts.icnSettings(driver).click();
		Actions action =  new Actions(driver);
	//	action.moveToElement(Contacts.icnSettings(driver)).build().perform();
		action.click(Contacts.icnSettings(driver)).build().perform();

		System.out.println("Clicked on Settings");
	}

	@Then("^user Clicks on Settings icon and user selects Log Out Option and log off\\.$")
	public void user_Clicks_on_Settings_icon_and_user_selects_Log_Out_Option_and_log_off() throws InterruptedException {

/*		Actions action =  new Actions(driver);
		action.click(Contacts.icnSettings(driver)).build().perform();
*/
		Contacts.icnSettings_LogOff(driver, "Log Out").click();
		driver.quit();
	}
}
