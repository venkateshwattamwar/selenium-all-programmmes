package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaits {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   
	 
	   driver.get("https://www.google.com/");  
	 
	   WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
	   
	   Actions act =new Actions(driver);
	   
	   act.click(searchbox).sendKeys("india").build().perform();
	   
	   act.sendKeys(Keys.ENTER).perform();
	   
	   driver.findElement(By.xpath("(//*[text()='Central Bank of India'])[1]")).click();
	   
	   
	   
		
	}

}
