package testCases;

import org.testng.annotations.Test;

import pageObjects.knowledgeBasePage;
import pageObjects.loginPage;

public class TC_007_KB extends testBase.baseClass 
{
	
	@Test
	public void testKB() throws InterruptedException
	{
		logger.info("Starting of TC_007_KB");
		
		// login 
		loginPage lp = new loginPage(driver);
		knowledgeBasePage kb = new knowledgeBasePage(driver);
		
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		
		// Navigate
		kb.clickOnKnowledgeBase();
		logger.info("Clicked on Knowledge Base menu");
		Thread.sleep(2000);
		
		//perform action
		kb.clickOnCreateFolderIcon();
		logger.info("Clicked on Create Folder icon");
		Thread.sleep(2000);
		
		kb.enterFolderName("Automation");
		logger.info("Entered folder name");
		Thread.sleep(2000);
		
		kb.clickOnCreateFolderButton();
		logger.info("Clicked on Create Folder button");
		Thread.sleep(2000);
		
		logger.info("Ending of TC_007_KB");
		
	}

}
