package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class uploadDocument extends basePage 
{

	
	public uploadDocument(WebDriver driver)
	{
		super(driver);
	}
	
//	page elements 
	@FindBy(xpath="//a[normalize-space()='Knowledge Base']")
	WebElement linkmain;
	
	@FindBy(xpath="//span[normalize-space()='Global']")
	WebElement linkprimary;
	
	@FindBy(xpath="//*[normalize-space()='Upload File']")
	WebElement uploadfile;
	
	@FindBy(name="file")
	WebElement fileupload;
	
//	@FindBy(xpath="//a[contains(text(), 'Sign up')]")
//	WebElement newone;
//	
//	@FindBy(xpath="//a[contains(text(), 'Sign up')]")
//	WebElement newone;
//	
//	@FindBy(xpath="//a[contains(text(), 'Sign up')]")
//	WebElement newone;
//	
//	@FindBy(xpath="//a[contains(text(), 'Sign up')]")
//	WebElement newone;
	
	
//	 action methods 
	
	public void clickmainmenu()
	{
		linkmain.click();
	}
	
	public void clickonGlobal() throws InterruptedException
	{
		linkprimary.click();
	}
	
	public void clickonGlobalandupload() throws InterruptedException
	{
		uploadfile.click();
		Thread.sleep(2000);
		fileupload.sendKeys("C:\\Users\\cehar\\OneDrive\\Desktop\\AllDocs\\50_Selenium_Interview_Questions.docx");
	}
}
