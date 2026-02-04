package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class logOut extends basePage 
{
	
	public logOut(WebDriver driver) 
	{
		super(driver);
	}
	
//	page locators 
	
	@FindBy(xpath = "//span[normalize-space()='Log Out']")
	WebElement linkLogoutlink;
	
//	action methods 

	public void clickLogoutlink()
	{
		linkLogoutlink.click();
	}
}
