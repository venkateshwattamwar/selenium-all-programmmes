package TestNgListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteLogin {
	static WebDriver driver;
	@Test(priority = 1)
	public void navToApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/");
		
	}
   @Test(priority = 2)
   public void loginToApp()
   {
	   driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	   
	driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
	
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Velocity@123");
	
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
	
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	String url = driver.getCurrentUrl();
	
	String expected ="dashboard1";
	
	boolean iscontains = url.contains(expected);
	
	System.out.println(iscontains);
    
	Assert.assertEquals(iscontains, true);
	

   }
 

}
