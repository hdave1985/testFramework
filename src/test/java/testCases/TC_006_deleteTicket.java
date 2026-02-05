package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import pageObjects.team;
import testBase.baseClass;

public class TC_006_deleteTicket extends baseClass 
{

	@Test
	public void deleteTicket() throws InterruptedException
	{
		
		logger.info("********** Starting TC_006_deleteTicket **********");
		
		loginPage lp = new loginPage(driver);
		pageObjects.deleteTicket dt = new pageObjects.deleteTicket(driver);
		  
		  
		  // first login
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		   
		   
		   dt.clickticketsmenu();
		   logger.info("Clicked on Tickets menu");
		   Thread.sleep(2000);
		   dt.clickdeleteicon();
		   logger.info("Clicked on Delete Ticket button");
		   Thread.sleep(2000);
		   dt.clickdeletebtn();
		   logger.info("Clicked on Confirm Delete Ticket button");
		   
		   
		logger.info("********** Ending TC_006_deleteTicket **********");
	}
}
