package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaniousmethods {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		WebElement username=d.findElement(By.xpath("//*[@name='username']"));
		
		username.sendKeys("abc@abc.com");
		
		//to verify that the typed string is the same or not
		
		String actual=username.getAttribute("value");
		
		System.out.println(actual);
		
		if(actual.equals("abc@abc.com"))
		{
			System.out.println("value got verified");
		}
		else
		{
			System.out.println("not matched");
		}
		
		//username.clear();
		
	   String m=d.getCurrentUrl();
	   System.out.println(m);
	   
	   //to get the title of the page

	   String n =d.getTitle();
	   System.out.println(n);
	   
	   d.quit();
	}

}
