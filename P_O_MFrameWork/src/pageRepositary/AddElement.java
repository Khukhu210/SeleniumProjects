package pageRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddElement
{
	WebDriver driver;

	public AddElement(WebDriver driver) {
		this.driver = driver;
	}

	public void addVacancy() {
		WebElement addbutton = driver.findElement(By.id("btnAdd"));
		addbutton.click();
	}

	public void selectJobTitle()
	{
		WebElement dropdown = driver.findElement(By.id("addJobVacancy_jobTitle"));
		Select jobtitle = new Select(dropdown); // to select drop down..
		
		//jobtitle.selectByIndex(2);	        // 3 different ways to select
	//	jobtitle.deselectByValue("4");  
	 jobtitle.selectByVisibleText("HR Executive");	
		
	}
	public void selectActiveCheckBox()
	{
		WebElement checkbox = driver.findElement(By.id("addJobVacancy_status"));
		if(checkbox.isSelected()==false)
		checkbox.click();	
	}
	
	public void deselectActiveCheckBox()
	{
		WebElement checkbox = driver.findElement(By.id("addJobVacancy_status"));
		if(checkbox.isSelected()==true)
		checkbox.click();	
	}
	
	 public void getTextOfButton()    //  in console we wil get save
	   {

			WebElement button = driver.findElement(By.id("btnSave"));
			String value = button.getAttribute("value");
			System.out.println(value );
	   }
	 
	 public void vacancyName()
	 {
			WebElement addname = driver.findElement(By.id("addJobVacancy_name"));
			addname.sendKeys("freshersjob");
	 }
	 
	 public void hiringName()
	 {
			WebElement hiringname = driver.findElement(By.id("addJobVacancy_hiringManager"));
			hiringname.sendKeys("Steven Edwards");
	 }
	 public void noOfPosition()
	 {
			WebElement position = driver.findElement(By.id("addJobVacancy_noOfPositions"));
			position.sendKeys("2");
	 }
	 
	 public void descrption()
	 {
			WebElement descrption = driver.findElement(By.id("addJobVacancy_description"));
			descrption.sendKeys("job vacancy purpose");
	 }
	 
	 
	 public void deselectActiveRssFeed()
		{
			WebElement checkbox = driver.findElement(By.id("addJobVacancy_publishedInFeed"));
			if(checkbox.isSelected()==true)
			checkbox.click();	
		}
	 
	 public void clickSave() {
			WebElement savebutton = driver.findElement(By.id("btnSave"));
			savebutton.click();
		}
}


