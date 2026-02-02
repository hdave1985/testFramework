package testCases;

import org.testng.annotations.Test;

import pageObjects.dashboardPage;
import pageObjects.loginPage;

public class TC_002_CreateTicket extends testBase.baseClass 
{

	@Test
	public void createTicketTest() throws InterruptedException
	{
		
		// login first 
		
		   loginPage lp = new loginPage(driver);
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		   // add the wait and assertion for dashboard page
		   // navigate to create ticket page
		   
			logger.info("Starting TC_002_CreateTicket");
			dashboardPage dp = new dashboardPage(driver);
			dp.clickTicketsMenu();
			logger.info("Clicked on Tickets menu");
			Thread.sleep(2000);
			
			//create ticket 
		
		logger.info("Ending TC_002_CreateTicket");
	}
}
