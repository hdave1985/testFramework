package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import testBase.baseClass;
import utilities.loginProvider;

public class TC_003_LoginDDT extends baseClass 
{

	@Test(dataProvider = "loginData", dataProviderClass = loginProvider.class)
	public void loginDDT(String uname, String pwd, String response) 
	{
		
		// here uname ,pwd, response from the function parameters are from the 
		// excel sheet of data provider method. 
		// excel sheet has 3 columns uname, password and response 
		
		logger.info("Starting of login DDT");
		
		
		loginPage lp = new loginPage(driver);
		lp.setUserName(uname);
		
		// here uname is from excel sheet and parameter of this method
		//logger.info("Provided user name");
		lp.setPassword(pwd);
		//logger.info("Provided password");
		lp.clickSignin();
		//logger.info("Clicked on Signin button");			
		//logger.info("Ending of login DDT");
	}
}
