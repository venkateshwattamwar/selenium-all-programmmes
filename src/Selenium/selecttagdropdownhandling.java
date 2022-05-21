package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selecttagdropdownhandling {
	//with get text method
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/signup");
		
		List<WebElement> daydropdown=d.findElements(By.xpath("//select[@id='day']//option"));
		
		for(WebElement m:daydropdown)
		{
		String n=m.getText();
		System.out.println(n);//console madhe index yetat
		
		if(n.equals("18"))
		{
			m.click();
		}
		}
		
		
		
		List<WebElement> monthdrop=d.findElements(By.xpath("//select[@id='month']//option"));
		
		for(WebElement a:monthdrop)
		{
			String b=a.getText();
			System.out.println(b);
			
			if(b.equals("Feb"))
			{
				a.click();			}
		
		
		List<WebElement> yeardrop=d.findElements(By.xpath("//select[@name='birthday_year']//option"));
		
		for(WebElement c:yeardrop)
		{
			String e=c.getText();
			System.out.println(e);
			
			if(e.equals("1920"))
			{
				c.click();
			}
			
		}
		
		
		}}}
	


