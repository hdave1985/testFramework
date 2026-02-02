package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.basePage;

public class ticketsPage extends basePage 
{

	
	public ticketsPage(WebDriver driver) 
	{
		super(driver);
	}
	
	// page elements
	@FindBy(xpath="//*[contains(text(), '                     New Ticket                 ')]")
	WebElement btnNewTicket;
	
	@FindBy(xpath="//input[@placeholder='Enter ticket title...']")
	WebElement txtTicketTitle;
	
	@FindBy(xpath="//input[@placeholder='First name...']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@placeholder='Last name...']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@placeholder='Email address of person reporting...']")
	WebElement txtEmail;
	
	@FindBy(xpath="//select[@name='assignee_id']")
	WebElement dropdownPriority;
//	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement txtcontent;
//	
	@FindBy(xpath="//button[contains(text(), 'Save Ticket')]")
	WebElement btnSaveTicket;
//	
//	@FindBy(xpath="")
//	WebElement btnNewTicket;
	
	
	// action methods
	
	public void clickNewTicket()
	{
		btnNewTicket.click();
	}
	
	public void setTicketTitle(String title)
	{
		txtTicketTitle.sendKeys(title);
	}
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void selectPriority()
	{
		Select objsel = new Select(dropdownPriority);
		objsel.selectByVisibleText("High");
	}
	
	public void clickSaveTicket()
	{
		btnSaveTicket.click();
	}
}
