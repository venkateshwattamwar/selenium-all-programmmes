package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenshotMethodForPc;

public class locator {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("velocity");
		
		driver.findElement(By.id("txtPassword")).sendKeys("123456");
		
		driver.findElement(By.className("button")).click();
		
		driver.navigate().back();
		
	//	d.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.partialLinkText("got you")).click();
		
		ScreenshotMethodForPc.ScreenshotMethodForPc1(driver,"scr2");
		
	}
	
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}


