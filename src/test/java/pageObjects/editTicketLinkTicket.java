package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class editTicketLinkTicket extends basePage 
{
	
	public editTicketLinkTicket(WebDriver driver)
	{
		super(driver);
	}
	
	// page elements 
	
//	@FindBy()
//	WebElement link;
	
	@FindBy(xpath="//a[@href='https://test.collable.be/apps/tickets']")
	WebElement mainmenuTickets;
	
	@FindBy(xpath="//*[@id=\"tickets-table-container\"]/div[1]/table/tbody/tr[1]/td[1]/a")
	WebElement firstTicket;
	
//	@FindBy(xpath="//button[normalize-space()='Link Ticket']")
//	WebElement buttonLinkTicket;
	
	@FindBy(xpath="//button[normalize-space()='Assign']")
	WebElement buttonAssign;
	
	@FindBy(xpath="//button[normalize-space()='Tech UAT']")
	WebElement ddlindex;
//	
//	@FindBy(id="relationship_type")
//	WebElement ddlRelationshipType;
	
	// action methods
	
	public void clickOnMainMenuTickets()
	{
		mainmenuTickets.click();
	}
	
	public void clickOnFirstTicket()
	{
		firstTicket.click();
	}
	
	
	public void clickOnButtonAssign()
	{
		buttonAssign.click();
	}
	
	public void clickOnDdlIndex()
	{
		ddlindex.click();
	}

}
