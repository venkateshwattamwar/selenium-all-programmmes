package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserOnCondition {
	
	public static void main(String[] args) {
		
		String browser="chrome";
		//String browser1="firefox";
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		}
//		else if(browser1.equals(firefox))
//		{
//			System.setProperty("webdriver .gecko.driver", "\"C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\geckodriver.exe\"");
//			webdriver d=new firefoxDriver();
//		}
	}

}
