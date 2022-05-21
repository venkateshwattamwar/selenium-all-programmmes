package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
        WebElement filechooserbutton = driver.findElement(By.xpath("//*[@name='upload']"));
		
		
		filechooserbutton.sendKeys("C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\Actions class in selenium.docx");
		
		
		
		
		
		
	}

}
