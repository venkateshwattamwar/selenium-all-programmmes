package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		link.click();
		link.click();
		link.click();
		
Set<String> allwinid = driver.getWindowHandles();
		
		int numberofid = allwinid.size();
		
		int i =0;
		String [] winid = new String[numberofid];
		
		for(String id:allwinid)
		{
			winid[i]=id;
			i++;
		}
		
		
		driver.switchTo().window(winid[2]);
		
		driver.get("https://www.google.com");
		
		
		

	}

}
