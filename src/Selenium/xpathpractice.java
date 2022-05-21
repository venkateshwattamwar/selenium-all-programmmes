package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
		
		d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
	//	d.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		d.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		for(int i=1;i<=3;i++)
		{
	//	d.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		
		d.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"] ")).click();	
		}
	}
	


		
	}
	


