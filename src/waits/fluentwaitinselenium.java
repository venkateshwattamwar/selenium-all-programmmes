package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwaitinselenium {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();//chrome will be open
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(20));
		
		WebElement dissablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		//wait till the element is clickable over the page
		
		wait.until(ExpectedConditions.elementToBeClickable(dissablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		//wait till the checkbox got selected
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
	    System.out.println("verified check box has been checked");
		
		
	}

}
