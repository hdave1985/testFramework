package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class loginPage extends basePage 
{

	public loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	// page elements and methods
	
	@FindBy(id="email")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSignin;
	
	
	//Action methods
	
	public void setUserName(String email)
	{
		txtusername.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickSignin()
	{
		btnSignin.click();
	}
}
