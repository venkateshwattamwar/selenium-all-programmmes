package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		// wait till the element is not clickable over the page
		
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		//waiting untill the elelment is visible over the webpage
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebElement visible = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		wait.until(ExpectedConditions.visibilityOf(visible));
		System.out.println("is visible");
	//	wait.until(ExpectedConditions.visibilityOf(disablebutton));
		
	
	}

}
