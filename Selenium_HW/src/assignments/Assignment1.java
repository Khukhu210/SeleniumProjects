package assignments;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//verify navigated to url
		
		String actualUrl = "http://automationpractice.com/index.php";
		String expectedUrl = driver.getCurrentUrl();
		
		if(actualUrl.equalsIgnoreCase(expectedUrl))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("bitkhushbookumari6210@gmail.com");
		driver.findElement(By.cssSelector(".icon-user.left")).click();
		
		// REGISTRATION
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("KHUSHBOO");
		driver.findElement(By.id("customer_lastname")).sendKeys("kUMARI");
		driver.findElement(By.id("passwd")).sendKeys("khukhu.1");
		
		// for filling date, month,year
		
		  WebElement dropdown = driver.findElement(By.id("days"));
		  Select date = new Select(dropdown); // to select drop down..
		  date.selectByIndex(20);
		  

		  WebElement dropdown1 = driver.findElement(By.id("months"));
		  Select month = new Select(dropdown1); // to select drop down..
		  month.selectByIndex(2);
		  
		  WebElement dropdown2 = driver.findElement(By.id("years"));
		   Select year = new Select(dropdown2); // to select drop down..
		//  year.selectByVisibleText("1992");
		     year.selectByIndex(28);
		  
		  // to select checkbox
		  WebElement checkbox = driver.findElement(By.id("newsletter"));
			if(checkbox.isSelected()==false)
			checkbox.click();
			
			driver.findElement(By.id("optin")).click();
			driver.findElement(By.id("company")).sendKeys("GSLabs");
			driver.findElement(By.id("address1")).sendKeys("Royal Vatika,Balewadi");
			driver.findElement(By.id("address2")).sendKeys("Royal Vatika,Balewadi");
			
			 driver.findElement(By.id("city")).sendKeys("Pune");
			
			  WebElement dropdown3 = driver.findElement(By.id("id_state"));
			  Select  state = new Select(dropdown3); // to select drop down..
			  state.selectByIndex(15);
			
			  driver.findElement(By.id("postcode")).sendKeys("41105");
			  
			  WebElement dropdown4 = driver.findElement(By.id("id_state"));
			  Select  country = new Select(dropdown4); // to select drop down..
			  country.selectByIndex(1);
			  
			  driver.findElement(By.id("other")).sendKeys("no comments");
			  driver.findElement(By.id("phone_mobile")).sendKeys("9122512987");
			  
			  driver.findElement(By.id("alias")).sendKeys("Balewadi");
			  driver.findElement(By.id("submitAccount")).click();
			  
			  // verify My account page is displayed
		/*
		 * WebElement username = driver.findElement(By.cssSelector(".page-heading"));
		 * boolean res = username.isDisplayed(); System.out.println(res);
		 */
}
	

}
