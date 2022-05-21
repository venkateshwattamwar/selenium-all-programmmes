package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsForBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();//chrome browser will get open 
		
		driver.manage().window().maximize();//to maximize the window
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();//browser back button operate
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//browser forward button operate
		
		driver.get("https://www.whatsapp.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();//browser refresh button
		
		Thread.sleep(2000);
		
		driver.close();//close the current browser window
		
		
		
		
	}

}
