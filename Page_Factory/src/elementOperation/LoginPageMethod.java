package elementOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elementDefinaion.LoginPage;

public class LoginPageMethod {

	WebDriver driver;
	LoginPage loginPage;

	public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	public void enterUserName() {
		loginPage.textbox_Username.sendKeys("admin");
	}

	public void enterPassword() {
		loginPage.textbox_Password.sendKeys("admin123");
	}
	
	public void clickLogin()
	{
		loginPage.textbox_Login.click();
	}
}
 