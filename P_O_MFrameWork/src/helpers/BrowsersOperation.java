package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersOperation {
WebDriver driver ;
	
	public  WebDriver LaunchApplication()
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		return driver;
	}

	
	// to get title of browser
	public String getTitleOfBrowser()
	{
		
		String title = driver.getTitle();
		return title;
	}
	
  
}
