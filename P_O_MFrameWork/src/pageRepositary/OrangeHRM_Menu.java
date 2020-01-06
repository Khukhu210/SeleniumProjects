package pageRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRM_Menu
{
	WebDriver driver ;
	
	  public OrangeHRM_Menu(WebDriver driver) {
			this.driver = driver;
		}

	public void clickRecuriment()
	  {
		  WebElement buutonclickobj = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		  buutonclickobj.click();
	  }
	  
	  public void clickVacancy()
	  {
		  WebElement buutonclickobj1 = driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
		  buutonclickobj1.click();
	  }
}
