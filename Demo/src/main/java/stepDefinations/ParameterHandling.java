package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class ParameterHandling {
	public  WebDriver driver;
	
	/*public ParameterHandling()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
	}*/
	
	
	/* @When("^user enter valid Facebook credentilas \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enter_valid_Facebook_credentilas_and(String username, String password) throws Throwable {
			System.out.println(username);
			System.out.println(password);
			driver.findElement(By.id("email")).sendKeys(username);
			   driver.findElement(By.id("pass")).sendKeys(password);
			   driver.quit();
		}*/

}
