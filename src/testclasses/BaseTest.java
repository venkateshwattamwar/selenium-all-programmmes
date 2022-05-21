package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.DashBoard;
import pages.Loginpage;

public class BaseTest {

	
	static WebDriver driver;
	Loginpage lp;
	DashBoard db;
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	@BeforeClass
	public void objectcreation()
	{
		 lp =new Loginpage(driver);
		 db =new DashBoard(driver);
	}
}
