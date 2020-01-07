package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		   
	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Sign")).click();
		
		driver.findElement(By.id("email")).sendKeys("bitkhushbookumari6210@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("khukhu.1");
		driver.findElement(By.id("SubmitLogin")).click();

		// my page account is displayed
		
		 WebElement username = driver.findElement(By.cssSelector(".page-heading"));
		  boolean res = username.isDisplayed();
		  System.out.println(res);
	}

}
