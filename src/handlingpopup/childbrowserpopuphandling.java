package handlingpopup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class childbrowserpopuphandling {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abc@abc.com");
		
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Continue']")).click();
		
		
		
		
}
}