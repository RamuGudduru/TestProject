package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01StepDefination extends DriverFactory {

	//private DriverFactory driverFactory;
	public DriverFactory driverFactory;
	
	@Before
	public void setupDriver() {
        
		   driverFactory = new DriverFactory();
	        driver = driverFactory.getDriver("Chrome");
	    }


	@Given("^Launch Facebook Application$")
	public void launch_Facebook_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is method 01");
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  
	   
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is method 02");
		   driver.findElement(By.id("email")).sendKeys("ramuchowdary233@gmail.com");
		   
		  // driver.findElement(By.id("u_0_5")).click();
		   
		   	
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is method 03");
		   driver.findElement(By.id("pass")).sendKeys("9951929446");
	}

	@Then("^User should login into Facebook application$")
	public void user_should_login_into_Facebook_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   System.out.println("This is method 04");
	}
	
/*	@After("@last")
	public void closeBrowser(){
		//driverFactory = new DriverFactory();
		DriverFactory.closeDriver();
		*/
	
	@After
	public void closeBrowser(){
		//driverFactory = new DriverFactory();
	closeDriver();
		
	}
}
