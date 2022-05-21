package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver .manage().window().maximize();
	
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
//    WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
//    
//    username.sendKeys("Admin");
//    
//    driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
//    
//    driver.findElement(By.xpath("//*[@type='submit']")).click();
//    
//    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
//    
//  JavascriptExecutor js = (JavascriptExecutor)driver;
//  
//  js.executeScript("window.scrollBy(0,800)");
//  
//  js.executeScript("window.scrollBy(0,-200)");
    
    //scroll over the pixel value
  
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    js.executeScript("window.scrollBy(0,400)");
    
    Thread.sleep(5000);
    
    js.executeScript("window.scrollBy(0,-150)");
  
    
    
}
}


