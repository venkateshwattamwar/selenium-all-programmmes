package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println("parent id is "+parentid);
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		link.click();//dusri window open hoil
		
		Set<String> allwind = driver.getWindowHandles();
		
		for(String id:allwind)
		{
		     if(!(id.equals(parentid)))//id he parent id chya equals nasel tr madhe ja
		     {
		    	 driver.switchTo().window(id);
		    	 
		    	 driver.get("https://www.google.co.in/");
		     }
		     System.out.println(id);
		    	 
		     
		}
		
		
		
	}

}
