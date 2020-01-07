package practiceSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest 
{
  
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		driver.manage().deleteAllCookies();  
	
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
       
	  // driver.findElements(By.xpath(""))  
	}
}