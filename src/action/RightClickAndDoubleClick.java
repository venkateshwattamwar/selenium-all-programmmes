package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
	   WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
	   
	   //performing right click on password field
	   
	   Actions act =new Actions (driver);
	   
	   act.contextClick(password).perform();//ya method ne right click hote
	   
	   //performing double click operation 
	   
	   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	   
	  WebElement doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
	  
	  act.doubleClick(doubleclick).perform();
	  
     	String text = driver.switchTo().alert().getText(); //ya method ne console madhe text written hoto
	
	     System.out.println(text);
	  
         driver.switchTo().alert().accept();
	  
	  
	   
	
	  
	  
	   
	   
	   
	   
	   
	   
	   
	    
	    
	
		
		
		
	}
}