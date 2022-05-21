package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/signup");
        
        Actions act=new Actions(driver);
        
        act.sendKeys(Keys.TAB).perform();
        
        act.sendKeys(Keys.TAB).sendKeys("firstname").sendKeys(Keys.TAB).sendKeys("surname").build().perform();
        
       WebElement mobileno = driver.findElement(By.xpath("//*[@name='reg_email__']"));
       
       act.click(mobileno).sendKeys("8600725558").build().perform();
        
        
        
        
        
        
	}

}
