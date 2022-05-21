package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling3 {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open 
		
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();//screen open kelyavr je pop up yete tyal handle karte
		
		WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
		
		month.click();
		
		Thread.sleep(2000);
		
		WebElement decmonth = driver.findElement(By.xpath("//*[@id='select-item-select-0-11']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",decmonth );
		
		
	}

}
