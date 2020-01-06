package pageRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName() {

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");

	}

	public void enterPassword() {
		WebElement username1 = driver.findElement(By.id("txtPassword"));
		username1.sendKeys("admin123");

	}

	public void clickLogin() {
		WebElement buttonClick = driver.findElement(By.id("btnLogin"));
		buttonClick.click();

	}

}
