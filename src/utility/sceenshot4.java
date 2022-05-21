package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sceenshot4 {
	
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.flipkart.com/");
		   
	//	   scrennshotthirdmethod.m1(driver,"Savkar");
		   
	}

}
