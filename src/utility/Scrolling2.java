package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open 
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
		
		username.sendKeys("Admin");
		
	    driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	    
	    //scroll upto a perticular element
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    WebElement checkbox = driver.findElement(By.xpath(("//*[@id='ohrmList_chkSelectRecord_47']")));
	    		
	  //  js.executeScript("arguments[0].scrollIntoView();",checkbox);//practice sathi lihil hot
	    
	  js.executeScript("arguments[0].scrollIntoView();", checkbox);
	    
	    
		
	}

}
