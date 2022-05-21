package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitewaitspractice {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		
	//	wait till the element is not clickable over the page
		
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//		2.waiting until the elementis visible nover the webpage
		
	     driver. findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
		
		System.out.println("Button is displayed on the page");
		
	//	3.alert
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		//change to text selenium webdriver
		
//	WebElement change = driver.findElement(By.xpath("//*[@class='btn btn-primary'])[3]"));
	
//	wait.until(ExpectedConditions.elementSelectionStateToBe(change, false));
//	System.out.println("checkbox is ");
	
	//4......
	
	 driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	 
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='ch']"));
	
	wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox, false));
	
	System.out.println("checkbox is visible");
		
	
		
		
		
		
		
		
		

	}

}
