package testCases;

import org.testng.annotations.Test;

import pageObjects.employeeuser;
import pageObjects.loginPage;
import testBase.baseClass;

public class TC_004_Employee extends baseClass 
{

	@Test
	public void createNewEmployee() throws InterruptedException 
	{
	
		logger.info("****Starting TC_004_Employee****");
		
		  loginPage lp = new loginPage(driver);
		  employeeuser ep = new employeeuser(driver); 
		  
		  
		  // first login
		   lp.setUserName(prop.getProperty("email"));
		   logger.info("Provided user name");
		   lp.setPassword(prop.getProperty("password"));
		   logger.info("Provided password");
		   lp.clickSignin();
		   logger.info("Clicked on Signin button");
		   Thread.sleep(5000);
		
		// second click on main menu employee
		   ep.clickonemployeelink();
		   logger.info("Clicked on Employee & Teams link");
		   ep.clickoninviteuser();
		   logger.info("Clicked on Invite User button");
		   Thread.sleep(2000);
		   ep.enterFirstname("Mark Automation");
		   logger.info("Entered First Name");
		   ep.enterLastname("Smith Automation");
		   logger.info("Entered Last Name");
		   ep.enterEmail("marksmith@gmail.com");
		   logger.info("Entered Email");
		   ep.clickonCreateEmployee();
		   logger.info("Clicked on Create Employee button");
		   
		
		logger.info("****Ending TC_004_Employee****");
		
	}
}
