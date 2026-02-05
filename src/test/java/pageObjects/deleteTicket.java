package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class deleteTicket extends basePage 
{
	
	public deleteTicket(WebDriver driver)
	{
		super(driver);
	}

	
	// page elements 
	@FindBy(xpath="//*[normalize-space()='Tickets'][1]")
	WebElement linkticketsmenu;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div[1]/form[1]/button[1]/i[1]")
	WebElement deleteicon;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement deletebtn;
//	
//	@FindBy()
//	WebElement link;
	
//	@FindBy()
//	WebElement link;
	
//	@FindBy()
//	WebElement link;
	
//	action methods
	
	public void clickticketsmenu()
	{
		linkticketsmenu.click();
	}
	
	public void clickdeleteicon()
	{
		deleteicon.click();
	}
	
	public void clickdeletebtn()
	{
		deletebtn.click();
	}
}
