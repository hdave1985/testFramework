package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.dashboardPage;
import pageObjects.loginPage;

public class TC_001_Login extends testBase.baseClass 
{

	@Test(groups = {"master"})
	public void loginTest()
	{
	
	   logger.info("Starting TC_001_Login");
	   System.out.println("From login test");
	   loginPage lp = new loginPage(driver);
	   lp.setUserName(prop.getProperty("email"));
	   logger.info("Provided user name");
	   lp.setPassword(prop.getProperty("password"));
	   logger.info("Provided password");
	   lp.clickSignin();
	   logger.info("Clicked on Signin button");
	   
	   
	   dashboardPage dp = new dashboardPage(driver);
	   if(dp.isDashboardLabelPresent())
	   {
		   logger.info("Login Test Passed");
		   Assert.assertTrue(true);
		   logger.info("Assertion is Passed");
	   }
	   else
	   {
		   logger.error("Login Test Failed");
		   Assert.fail("Assertion failed");		    	   
	   }
	   
	   logger.info("Ending TC_001_Login");
	}
	
}
