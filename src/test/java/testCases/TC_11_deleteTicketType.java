package testCases;

import org.testng.annotations.Test;

import pageObjects.deleteTickettypePage;
import pageObjects.loginPage;
import testBase.baseClass;

public class TC_11_deleteTicketType extends baseClass
{
	
	@Test
	public void deleteFirstTicketType() throws InterruptedException
	{
		
		logger.info("Starting of TC_11_deleteTicketType");
		loginPage lp = new loginPage(driver);
		lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		Thread.sleep(5000);
		
		
		deleteTickettypePage ticketype = new deleteTickettypePage(driver);
		ticketype.clickConfigmainmenulink();
		Thread.sleep(2000);
		logger.info("Clicked on config main menu link");
		ticketype.clickDelete();
		Thread.sleep(2000);
		logger.info("Clicked on delete icon on table");
		ticketype.clickonDeletebutton();
		Thread.sleep(2000);
		logger.info("Clicked on delete button on dialog ");


		logger.info("Ending of TC_11_deleteTicketType");
	}

}
