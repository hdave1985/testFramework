package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class dashboardPage extends basePage 
{

	public dashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
//	page locators 
	@FindBy(xpath = "//span[contains(text(), 'Dashboard')]")	
	WebElement dashboardLabel;
	
	@FindBy(xpath = "//a[normalize-space()='Tickets']")	
	WebElement ticketsMenu;
	
//	action methods
//	//span[contains(text(), 'Dashboard')]
	
	public boolean isDashboardLabelPresent()
	{
		return dashboardLabel.isDisplayed();
	}
	
	public void clickTicketsMenu()
	{
		ticketsMenu.click();
	}
	
	
}
