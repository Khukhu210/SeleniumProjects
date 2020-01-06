package test;

import org.openqa.selenium.WebDriver;

import helpers.BrowsersOperation;
import pageRepositary.DashBoard;
import pageRepositary.LoginPage;

public class LoginTest
{

	public static void main(String[] args) {
		
		BrowsersOperation browserOperationsobj = new BrowsersOperation();
		WebDriver driver = browserOperationsobj.LaunchApplication();

		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterUserName();
		loginpageobj.enterPassword();
		loginpageobj.clickLogin();

		//return title from method
		// store title in main
		// verify title is OrangeHrm

		String str = browserOperationsobj.getTitleOfBrowser();

		if (str.equals("OrangeHRM"))

		{
			System.out.println("title matched");
		}
		
		

		DashBoard dashBoardob = new DashBoard(driver);
		boolean res = dashBoardob.verifyLogin();

		if (res == true)

		{
			System.out.println("dashboard  sucessfully login");
		}

		// welcome admin is present or not

		String res1 = dashBoardob.verifyUser();
		if (res1.equals("Welcome Admin")) {
			System.out.println("welcome adimn is correct");
		}
	}

}