package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
		
		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		
		WebElement adminlink = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(adminlink).perform();	
		
		act.moveToElement(adminlink).moveToElement(adminlink).click(adminlink);
		
		
		
		
	}

}
