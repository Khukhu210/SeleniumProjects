package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import elementOperation.LoginPageMethod;
import helpers.BrowserOperations;

public class LoginTest
{  
	WebDriver driver;
	@Test
 public void loginTestMethod() throws Exception
	{
		// launch application in chrome
		BrowserOperations browserOperations = new BrowserOperations();
		driver = browserOperations.LaunchApplication("Chrome");

		String actualTitle = browserOperations.getTitleOfBrowser();
		// verify the application is launched or not
		/*
		 * if(actualTitle.equals("OrangeHRM" )) System.out.println("Title matched");
		 * else System.out.println("Title  not matched");
		 */

		// this can be replaced by Assert keyword
		Assert.assertEquals(actualTitle, "OrangeHRM12");

		LoginPageMethod loginPageMethodobj = new LoginPageMethod(driver);
		loginPageMethodobj.enterUserName();
		loginPageMethodobj.enterPassword();
		loginPageMethodobj.clickLogin();

	}
	
	@AfterMethod
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot sc = (TakesScreenshot)driver;
			File file = sc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(file, new File(".\\ScreenShot\\Error.png"));
		}
	}
	
}

