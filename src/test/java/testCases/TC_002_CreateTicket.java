package testCases;

import org.testng.annotations.Test;

import pageObjects.dashboardPage;
import pageObjects.loginPage;
import pageObjects.ticketsPage;

public class TC_002_CreateTicket extends testBase.baseClass 
{

	@Test
	public void createTicketTest() throws InterruptedException
	{
		logger.info("Starting TC_002_CreateTicket");
		// login first 
		
		   loginPage lp = new loginPage(driver);
		   dashboardPage dp = new dashboardPage(driver);
		   ticketsPage tp = new ticketsPage(driver);
		   
		   
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		   
		   // add the wait and assertion for dashboard page
		   // navigate to create ticket page
		   			
			
			dp.clickTicketsMenu();
			logger.info("Clicked on Tickets menu");
			Thread.sleep(2000);
			
			//create ticket 
		    
		    tp.clickNewTicket();
		    Thread.sleep(2000);
		    logger.info("Clicked on New Ticket button");
		    tp.setTicketTitle("Issue with login functionality");
		    logger.info("Entered Ticket Title");
		    tp.setFirstName("John");
		    logger.info("Entered First Name");
		    tp.setLastName("Doe");
		    logger.info("Entered Last Name");
		    tp.setEmail("johndoe@gmail.com");
		    logger.info("Entered Email");
		    tp.selectPriority();
		    logger.info("Selected Priority");
		    tp.setContent("Unable to login with valid credentials.");
		    logger.info("Entered Ticket Content");
		    tp.clickSaveTicket();
		    logger.info("Clicked on Save Ticket button");
			
		logger.info("Ending TC_002_CreateTicket");
	}
}
