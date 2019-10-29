package testmeapp.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

	public static WebDriver getDriver(String Bm) 
	{
		
		if(Bm.equals("CR"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(Bm.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		//else if(BrNm.equals("ff"))
		//{
			//System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\gechidriver.exe");
			//return new ChromeDriver();
		//}
		else 
			return null;
		
		
	}

}
