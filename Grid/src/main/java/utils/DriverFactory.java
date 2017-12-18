package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DriverFactory {

	public WebDriver driver;
	
	public WebDriver getDriver(String Browser){
		if(driver==null)
		{
			if(Browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}else if(Browser.equalsIgnoreCase("Firefox")){
				
				System.setProperty("webdriver.gecko.driver", "E:\\Selenium Files\\Drivers\\geckodriver.exe");
			
				driver=new FirefoxDriver();
				//driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			
		}	
		
		return driver;
	}
	 
	
	public void closeDriver(){
		
		if(driver!=null){
			
			try{
			driver.close();
			driver.quit();
			}catch(Exception e){
				
				System.out.println(e.getMessage());
			}
			
		}
	}

}
