package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(2000);
		
		String textonalert=driver.switchTo().alert().getText();//text write in console
		Thread.sleep(2000);
		//to handle the pop up we have to call alert()method
		
		System.out.println("text on alert pop up is" +textonalert);
	
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//confirmation alert pop up
		
	  driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	  
	  Thread.sleep(2000);
	  
	  String confirmationstring=driver.switchTo().alert().getText();
	  
	  System.out.println(confirmationstring);
	  
	  driver.switchTo().alert().dismiss();
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
		
	}

}
