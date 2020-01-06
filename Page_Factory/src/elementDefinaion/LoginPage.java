package elementDefinaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage

{
	WebDriver driver;
	
	@FindBy(how= How.ID,using= "txtUsername")  // how to define an element in page factory
    public  WebElement textbox_Username;
  
	@FindBy(how= How.ID,using= "txtPassword")
    public  WebElement textbox_Password;
	
	@FindBy(how= How.ID,using= "btnLogin")
    public  WebElement textbox_Login;
  
}
