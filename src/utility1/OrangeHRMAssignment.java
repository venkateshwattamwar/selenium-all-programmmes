package utility1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Readorange;

public class OrangeHRMAssignment {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
		
		username.sendKeys(ReadOrange1.readmethod(6, 0));// method la call kel readOrange1 class madhun excel file madhun data ghet ahe
		
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(ReadOrange1.readmethod(6, 1));//excel file madhun data ghet ahe
		
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		
	}

}
