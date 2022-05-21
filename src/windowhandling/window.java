package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println("parent id is "+parentid);
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		link.click();
		
		Set<String> allwind = driver.getWindowHandles();
		
		for(String id:allwind)
		{
			System.out.println(id);
		}
	//	driver.close();-->is used to close the current window on which the focus is available
		
	//driver.quite();-->this will close the all the windows which got open during the automation process
		
		
		
		
		
	
	}

}
