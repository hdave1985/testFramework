package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import testBase.baseClass;

public class loginProvider extends baseClass 
{

	@DataProvider(name = "loginData")
	public String[][] getLoginData() throws IOException
	{
		
		System.out.println("From data provider");
		
		String path = ".\\testData\\Opencart_LoginData.xlsx";
		
		Excelutility excel = new Excelutility(path);
		
		int totalrows = excel.getRowCount("Sheet1");
		int totalcols = excel.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols];
		
		for(int i =1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j] = excel.getCellData("Sheet1", i, j);
			}
		}
		
		return logindata;
		
	}
	
}
