package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class employeeuser extends basePage 
{

	
	public employeeuser(WebDriver driver) 
	{
		super(driver);
	}
	
//	page element
	
	@FindBy(xpath="//a[normalize-space()='Employees & Teams']")
	WebElement employeelink;
	
	@FindBy(xpath="//a[normalize-space()='Invite User']")
	WebElement btninviteuser;
	
	@FindBy(xpath="")
	WebElement txtfirstname;
	
	@FindBy(xpath="")
	WebElement txtlastname;
	
	@FindBy(xpath="")
	WebElement txtemail;
	
	@FindBy(xpath="")
	WebElement btnCreateEmployee;
	
	
//	Action methods 
}
