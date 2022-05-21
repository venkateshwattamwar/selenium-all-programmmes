package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		d.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		d.findElement(By.xpath("//input[@name='Submit']")).click();
		
		Thread.sleep(2000);
		
		
		d.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
		
		Thread.sleep(2000);
		for(int i=1;i<=49;i++)
		{
			if(i%2!=0)
			{
			d.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		}}
		
		
		
		
		
		
		
		
		
		
		
	}

}
