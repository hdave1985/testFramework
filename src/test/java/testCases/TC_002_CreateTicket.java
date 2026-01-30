package testCases;

import org.testng.annotations.Test;

import pageObjects.dashboardPage;

public class TC_002_CreateTicket extends testBase.baseClass 
{

	@Test
	public void createTicketTest() throws InterruptedException
	{
		logger.info("Starting TC_002_CreateTicket");
		dashboardPage dp = new dashboardPage(driver);
		dp.clickTicketsMenu();
		logger.info("Clicked on Tickets menu");
		Thread.sleep(2000);
		
		logger.info("Ending TC_002_CreateTicket");
	}
}
