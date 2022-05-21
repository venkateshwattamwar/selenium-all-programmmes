package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideHandling {
	
	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver=new ChromeDriver();		
  
  driver.manage().window().maximize();
  
  driver.get("https://jqueryui.com/slider/");
  
  WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
  
  driver.switchTo().frame(iframe);//frame madhe jate
  
 WebElement slidecomponent = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
 
 Actions act =new Actions (driver);
 
 act.clickAndHold(slidecomponent).moveByOffset(350, 0).moveByOffset(-100, 0).release().build().perform();
 
 driver.switchTo().parentFrame();//parent frame madhe jate
 
 driver.findElement(By.xpath("//*[text()='Droppable']")).click();
 
 
  
  
  
 
  
  
  
	}

}
