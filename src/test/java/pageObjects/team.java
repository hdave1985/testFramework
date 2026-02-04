package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.basePage;

public class team extends basePage 
{

	public team(WebDriver driver)
	{
		super(driver);
	}

	// page elements
	@FindBy(xpath = "//a[normalize-space()='Employees & Teams']")
	WebElement linkemployeesteams;
	
	@FindBy(xpath = "//button[normalize-space()='Teams']")
	WebElement linkteams;
	
	@FindBy(xpath = "//button[normalize-space()='Add Team']")
	WebElement addteams;
	
	@FindBy(id = "team_name")
	WebElement textteamname;
	
	@FindBy(id = "manager_id")
	WebElement ddlmanagername;
	
	@FindBy(xpath = "//button[normalize-space()='Create Team']")
	WebElement btncreteteam;
	
	@FindBy(id = "")
	WebElement btncancel;
	
	
	
	
	// action methods 
	
	public void clickteamlink()
	{
		linkemployeesteams.click();
	}
	
	public void clickteamslink()
	{
		linkteams.click();
	}
	
	public void clickaddteams()
	{
		addteams.click();
	}
	
	public void enterteamname(String teamname)
	{
		textteamname.sendKeys(teamname);
	}
	
	public void selectmanagername() throws InterruptedException
	{
		Select objsel = new Select(ddlmanagername);
		objsel.selectByIndex(1);
		Thread.sleep(2000);
	}
	
	public void clickcreateteambtn()
	{
		btncreteteam.click();
	}
	
	
}
