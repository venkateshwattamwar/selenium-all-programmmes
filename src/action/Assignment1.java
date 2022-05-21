package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		


		
		Actions act=new Actions (driver);	
		
		WebElement password = driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
				
        act.keyDown(Keys.CONTROL).click(password).build().perform();
		
	}

}
