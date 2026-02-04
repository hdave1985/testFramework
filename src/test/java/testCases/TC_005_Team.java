package testCases;

import org.testng.annotations.Test;

import pageObjects.employeeuser;
import pageObjects.loginPage;
import pageObjects.team;
import testBase.baseClass;

public class TC_005_Team extends baseClass 
{
	
	
	@Test
	public void createTeamTest() throws InterruptedException
	{
		logger.info("********** Starting TC_005_Team **********");
		loginPage lp = new loginPage(driver);
		team tm = new team(driver);
		  
		  
		  // first login
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		   
		   // navigate to team page
		   tm.clickteamlink();
		   logger.info("Clicked on Employees & Teams link");
		   tm.clickteamslink();
		   logger.info("Clicked on Teams link");
		   tm.clickaddteams();
		   logger.info("Clicked on Add Team button");
		   Thread.sleep(2000);
		   tm.enterteamname("High 1");
		   logger.info("Entered Team Name");
		   Thread.sleep(2000);
		   tm.selectmanagername();
		   logger.info("Selected Manager Name");
		   Thread.sleep(2000);
		   tm.clickcreateteambtn();
		   logger.info("Clicked on Create Team button");
		   
		   
		   // create the team
		
		logger.info("********** Ending TC_005_Team **********");
	}

}
