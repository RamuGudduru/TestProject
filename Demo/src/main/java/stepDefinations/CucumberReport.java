package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberReport { 
  public  WebDriver driver; 
	
   @Given("^I have opened the browser$") 
   public void openBrowser() { 
	    System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
   } 
   
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exists$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0_t")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail");
      }
    
   } 
	
   @Then("^Forgot password link should exist$") 
   public void forgotPWD() { 
      if(driver.findElement(By.id("")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else {
         System.out.println("Test 1 Fail");
      } 
   } 
   
   @When("^user enter valid Facebook credentilas \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_Facebook_credentilas_and(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.id("email")).sendKeys(username);
		   driver.findElement(By.id("pass")).sendKeys(password);
		   driver.quit();
	}

   
   
}