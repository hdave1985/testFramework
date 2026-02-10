package testCases;

import org.testng.annotations.Test;

import pageObjects.editTicketLinkTicket;
import pageObjects.loginPage;

public class TC_009_FirstTicketAssignment extends testBase.baseClass 
{

	
	@Test
	public void firstTicketAssignment() throws InterruptedException
	{
		
		logger.info("Starting of TC_009_FirstTicketAssignment");
		
		loginPage lp = new loginPage(driver);
		lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		Thread.sleep(5000);
		
		
		//navigate to ticket page 
		editTicketLinkTicket et = new editTicketLinkTicket(driver);
		et.clickOnMainMenuTickets();
		logger.info("Clicked on Main Menu Tickets");
		Thread.sleep(2000);
		et.clickOnFirstTicket();
		logger.info("Clicked on First Ticket");
		Thread.sleep(2000);
		et.clickOnButtonAssign();
		logger.info("Clicked on Assign button");
		Thread.sleep(2000);
		et.clickOnDdlIndex();
		logger.info("Clicked on Tech UAT option");
		Thread.sleep(2000);
		
			
		logger.info("Ending of TC_009_FirstTicketAssignment");
	}
}
