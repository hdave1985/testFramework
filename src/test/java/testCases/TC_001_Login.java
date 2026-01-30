package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;

public class TC_001_Login extends testBase.baseClass 
{

	
	@Test
	public void loginTest()
	{
	
	   logger.info("Starting TC_001_Login");
	   System.out.println("From login test");
	   loginPage lp = new loginPage(driver);
	   lp.setUserName("ruchatechdesk@gmail.com");
	   logger.info("Provided user name");
	   lp.setPassword("Password@1");
	   logger.info("Provided password");
	   lp.clickSignin();
	   logger.info("Clicked on Signin button");
	   logger.info("Ending TC_001_Login");
	
	}
	
}
