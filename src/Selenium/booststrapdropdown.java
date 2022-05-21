package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booststrapdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://zoom.us/signup");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		WebElement month = d.findElement(By.xpath("//*[@class='zm-scrollbar__view'][1]"));
		month.click();
		
		Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id='select-item-select-0-4']")).click();
		
		
		
	}

	}





