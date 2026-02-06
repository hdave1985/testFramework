package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class knowledgeBasePage extends basePage
{

	public knowledgeBasePage(WebDriver driver)
	{
		super(driver);
	}
	
	// page elements
	
//	@FindBy()
//	WebElement link;
	// 
	
	
	@FindBy(xpath="//a[normalize-space()='Knowledge Base']")
	WebElement mainmenulinkknowledgeBase;
	
	@FindBy(xpath="(//button[@title='Add subfolder'])[1]")
	WebElement createfoldericon;
	
//	@FindBy(name="parent_id")
	
	@FindBy(xpath="(//input[@x-model=\"newFolderName\"])[1]")
	WebElement txtfoldername;
	
	@FindBy(xpath="(//input[@name='name']/following-sibling::button[@type='submit'])[1]")
	WebElement createfolderbutton;
	
//	@FindBy()
//	WebElement link;
	
//	@FindBy()
//	WebElement link;
	
	
	//action methods
	
	public void clickOnKnowledgeBase()
	{
		mainmenulinkknowledgeBase.click();
	}
	
	public void clickOnCreateFolderIcon()
	{
		createfoldericon.click();
	}
	
	public void enterFolderName(String foldername)
	{
		txtfoldername.sendKeys(foldername);
	}
	
	public void clickOnCreateFolderButton()
	{
		createfolderbutton.click();
	}
}
