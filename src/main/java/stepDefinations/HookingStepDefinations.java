package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class HookingStepDefinations {

//	@Before  //Global hooks like After class
//	public void SetupBrowser()
//	{
//		System.out.println("Launching Chrome Browser");
//	}
//	@After  //Global hooks like After class
//	public void tearDownBrowser()
//	{
//		System.out.println("Quit Browser Instance!!!!!!!!");
//	}
//	@Before("@First")     //local hooks only for first scenario
//	public void CheckFiles()
//	{
//		System.out.println("Files validated sucessfully");
//	}
//	@After("@First")
//	public void Destoryfiles()
//	{
//		System.out.println("Files destroyed sucessfully");
//	}
	
	@Before(order=0)  //applicable throught the program
	public void SetupBrowser()
	{
		System.out.println("Launching Chrome Browser");
	}
	@After(order=0)  //applicable throught the program
	public void tearDownBrowser()
	{
		System.out.println("Quit Browser Instance!!!!!!!!");
	}
	@Before(order=1)     //applicable throught the program
	public void CheckFiles()
	{
		System.out.println("Files validated sucessfully");
	}
	@After(order=1) //applicable throught the program
	public void Destoryfiles()
	{
		System.out.println("Files destroyed sucessfully");
	}
	
	@Given("^first step for hooking$")
	public void first_step_for_hooking() {
		
		System.out.println("**********first step for hooking");
	}

	@When("^second step for hooking$")
	public void second_step_for_hooking() {
		System.out.println("!!!!!!!!!!!Second step for hooking");
	}

	@Then("^third step for hooking$")
	public void third_step_for_hooking() {
		
		System.out.println("***********Third step for hooking");
	}
}
