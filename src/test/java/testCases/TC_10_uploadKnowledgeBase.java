package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import testBase.baseClass;

public class TC_10_uploadKnowledgeBase extends baseClass 
{

	@Test
	public void uploadDocument() throws InterruptedException
	{
		logger.info("Starting TC_10_uploadKnowledgeBase test");
		loginPage lp = new loginPage(driver);
		lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		Thread.sleep(5000);
		
		pageObjects.uploadDocument up = new pageObjects.uploadDocument(driver);
		up.clickmainmenu();
		logger.info("Clicked on Knowledge Base menu");
		Thread.sleep(2000);
		up.clickonGlobal();
		logger.info("Clicked on Global menu");
		Thread.sleep(2000);
		up.clickonGlobalandupload();
		
		
		logger.info("Ending of TC_10_uploadKnowledgeBase test");
	}
}
