package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass 
{

	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass
	public void testSetup()
	{
		System.out.println("From test setup");
		logger = LogManager.getLogger(this.getClass());
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(20));
		driver.get("https://test.collable.be/");
		logger.info("URL is opened");
	}
	
	
	@AfterClass
	public void testTeardown()
	{
		System.out.println("From test tear down");
		driver.quit();
	}
	
	
}
