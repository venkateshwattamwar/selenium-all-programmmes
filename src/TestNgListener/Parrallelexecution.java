package TestNgListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parrallelexecution {
	
	@Test
	public void googleTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.google.com");
	}
	@Test
	public void facebookTest()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\driver edge\\edgedriver_win64\\msedgedriver.exe");

	    WebDriver driver = new EdgeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.facebook.com");
	}
	

}
