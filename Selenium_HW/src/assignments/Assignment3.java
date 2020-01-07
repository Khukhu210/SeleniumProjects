package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

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

				/*
				 * if (actualtitle.contentEquals("PHPTRAVELS | Travel Technology Partner")) {
				 * System.out.println("pass"); } else { System.out.println("fail"); }
				 */
				driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen2']")).sendKeys("Pune");
				driver.findElement(By.xpath("//span[@class='select2-match']")).click();

				driver.findElement(By.xpath("//input[@id='checkin']")).sendKeys("30/12/2019");
				driver.findElement(By.xpath("//input[@id='checkout']")).sendKeys("03/01/2020");
				//driver.findElement(By.xpath("//input[@type ='text' and @name='children']"));
				driver.findElement(By.xpath("//div[@class='col-md-2 col-xs-12 o1']//button[@type ='submit' and @class='btn btn-primary btn-block']")).click();
			}
		}
	}
}
