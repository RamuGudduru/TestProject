package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01StepDefination {

    public WebDriver driver;

	@Given("^Launch Facebook Application$")
	public void launch_Facebook_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is method 01");
	   
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is method 02");
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is method 03");
	}

	@Then("^User should login into Facebook application$")
	public void user_should_login_into_Facebook_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("This is method 04");
	}
}
