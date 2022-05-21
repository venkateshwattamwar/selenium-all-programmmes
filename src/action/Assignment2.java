package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement adminlink = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		
		Actions act=new Actions(driver);
		
	//	act.moveToElement(adminlink).perform(); 
		
//		
//		WebElement web=driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
//		
//		act.moveToElement(web).perform();
//		////a[@id='menu_admin_viewSystemUsers']
//		
//		WebElement web1=driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
//		
//		
//		act.click(web1).perform();
//		
		
		act.moveToElement(adminlink).moveToElement(adminlink).click(adminlink).build().perform();
		
	}

}
