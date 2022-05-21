package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRmassignment {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
		
		username.sendKeys(Readorange.readmethod(6, 0));
		
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(Readorange.readmethod(6, 1));
		
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		
	}

}
