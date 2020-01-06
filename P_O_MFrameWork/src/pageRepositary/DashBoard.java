package pageRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
	WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyLogin() {
		WebElement username = driver.findElement(By.id("welcome"));
		boolean res = username.isDisplayed();
		return res;
	}

	public String verifyUser() {
		WebElement username = driver.findElement(By.id("welcome"));
		String text = username.getText();
		return text;
	}
}
