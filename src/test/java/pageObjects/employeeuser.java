package pageObjects;

import org.openqa.selenium.WebDriver;
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
	
	@FindBy(id="first_name")
	WebElement txtfirstname;
	
	@FindBy(id="last_name")
	WebElement txtlastname;
	
	@FindBy(id="email")
	WebElement txtemail;
	
	@FindBy(xpath="//*[normalize-space()='Create Employee']")
	WebElement btnCreateEmployee;
	
	
//	Action methods 
	
	public void clickonemployeelink()
	{
		employeelink.click();
	}
	
	public void clickoninviteuser()
	{
		btninviteuser.click();
	}
	
	public void enterFirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void enterLastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void enterEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void clickonCreateEmployee()
	{
		btnCreateEmployee.click();
	}
}
