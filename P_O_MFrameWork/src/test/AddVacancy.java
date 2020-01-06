package test;

import org.openqa.selenium.WebDriver;

import helpers.BrowsersOperation;
import pageRepositary.AddElement;
import pageRepositary.LoginPage;
import pageRepositary.OrangeHRM_Menu;

public class AddVacancy {

	public static void main(String[] args) throws Exception {

		BrowsersOperation browserOperationsobj = new BrowsersOperation();
		WebDriver driver = browserOperationsobj.LaunchApplication();

		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterUserName();
		loginpageobj.enterPassword();
		loginpageobj.clickLogin();
		Thread.sleep(2000);

		
		OrangeHRM_Menu orange = new OrangeHRM_Menu(driver);
		orange.clickRecuriment();
		orange.clickVacancy();

		
		// AddElement 
		AddElement addvacobj = new AddElement(driver);
		addvacobj.addVacancy();

		
		addvacobj.selectJobTitle();
		
		//addvacobj.selectActiveCheckBox();
		addvacobj.deselectActiveCheckBox();
		
		addvacobj.getTextOfButton();	
		
		  addvacobj.vacancyName(); 
		  addvacobj.hiringName();
		  addvacobj.noOfPosition();
		  addvacobj.descrption(); 
		  // addvacobj.deselectActiveRssFeed();
		  addvacobj.clickSave();
		 
		
	}

}
