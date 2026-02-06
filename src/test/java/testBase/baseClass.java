package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass 
{

	public WebDriver driver;
	public Logger logger; // logger is interface log4j.Logger from log4j
	public Properties prop;
	
//	groups = {"master", "regression"}
	@BeforeClass(groups = {"master","sanity"})
	@Parameters({"browser","os"})
	public void testSetup(String browser, String os) throws IOException
	{
		FileReader fr = new FileReader(".\\src\\test\\resources\\config.properties");
		// all are double back slash in windows path
		prop = new Properties();
		prop.load(fr);
		
		
		System.out.println("From test setup");
		logger = LogManager.getLogger(this.getClass());
		
		
		switch (browser.toLowerCase()) 
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;

		default: logger.info("Not proper browser name received from testng xml file");
			break;
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(20));
//		driver.get("https://test.collable.be/");
		driver.get(prop.getProperty("url"));
		logger.info("URL is opened");
		
	}
	
	
	@AfterClass(groups = {"master","sanity"})
	public void testTeardown()
	{
		System.out.println("From test tear down");
		driver.quit();
	}
	
	
	public String captureScreen(String tname)
	{
		System.out.println("From base class");
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;
	}
	
}
