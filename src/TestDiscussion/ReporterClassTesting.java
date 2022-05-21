package TestDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClassTesting {
	
	@Test
	public void logout()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://www.google.com");
		
		Reporter.log("this is log test case", true);//true will print not only inside report as well in console also
		

}
}