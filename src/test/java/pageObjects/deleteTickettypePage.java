package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class deleteTickettypePage extends basePage 
{
	
	public deleteTickettypePage(WebDriver driver)
	{
		super(driver);
	}
	
	// locators 
//	@FindBy()
//	WebElementmainmenulink;
	
	@FindBy(xpath="//a[normalize-space()='Config']")
	WebElement mainmenulink;
	
	@FindBy(xpath="//button[normalize-space()='Automation']")
	WebElement btnAutomation;
	
	@FindBy(xpath="//tr[1]/td[4]/button[1]")
	WebElement firstdeletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement deletebutton;
	
	
	// action methods 
	
	public void clickConfigmainmenulink()
	{
		mainmenulink.click();
	}
	
	public void clickDelete()
	{
		firstdeletebutton.click();
	}
	
	public void clickonDeletebutton()
	{
		deletebutton.click();
	}

}

