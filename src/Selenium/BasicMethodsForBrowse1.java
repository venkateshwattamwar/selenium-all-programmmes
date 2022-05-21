package Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.screenshotMethodForProject;

public class BasicMethodsForBrowse1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        
        driver.get("https://www.whatsapp.com/");
        
        driver.navigate().back();
        
       Thread.sleep(2000);
       
    //   d.navigate().back();
       
       Thread.sleep(2000);
       
       driver.get("https://wynk.in/music");
       
       Thread.sleep(3000);
       
       driver.navigate().forward();
       Thread.sleep(2000);
       
       driver.navigate().refresh();
       
       Thread.sleep(2000);
       
       driver.get("https://www.instagram.com/");
       
       Thread.sleep(2000);
       
     //  d.close();
       screenshotMethodForProject.m1(driver,"SCR1");	
	}

}
