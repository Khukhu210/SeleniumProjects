package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://phptravels.com/demo/");
		// driver.get("https://www.phptravels.net/index.php");
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();

		driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block")).click();

		// driver.switchTo().alert().dismiss();

		Set<String> allwindowHandle = driver.getWindowHandles();
		for (String handlechild : allwindowHandle) {
			if (!parent.equalsIgnoreCase(handlechild)) {
				driver.switchTo().window(handlechild);

				String actualtitle = driver.getTitle();
				System.out.println(actualtitle);
		
				
				driver.findElement(By.xpath("//a[@class='text-center flights ']")).click();
				
				
				/*
				 * // to select checkbox WebElement checkbox = driver.findElement(By.
				 * xpath("//label[@class='custom-control-label'and @ for='flightSearchRadio-1']"
				 * )); if(checkbox.isSelected()==false) checkbox.click();
				 */
				 
				//driver.findElement(By.xpath("//li[@class='active-result result-selected'and @data-option-array-index='1']"));
				
				/*
				 * WebElement dropdown = driver.findElement(By.
				 * xpath("//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch chosen-container-active']"
				 * )); Select country = new Select(dropdown); country.selectByIndex(2);
				 */
				//driver.findElement(By.xpath("//span[text()='Business']")).click();
				//driver.findElement(By.xpath("//input[@id='flightSearchRadio-1']")).click();
				driver.findElement(By.id("flightSearchRadio-1")).click();
			}
			
			
		}	
	}

}
