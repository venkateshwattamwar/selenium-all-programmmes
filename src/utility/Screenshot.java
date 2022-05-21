package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
public static void main(String[] args) throws IOException {
	
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
   
   WebDriver driver =new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://zoom.us/signup");
   
  TakesScreenshot scr = (TakesScreenshot)driver;//type casting
  
  File source = scr.getScreenshotAs(OutputType.FILE);//screenshot ghete
  
  String path="C:\\Users\\ADMIN$\\Pictures\\sql\\screenshot of selinium\\zoomscreenshot.png";//path
  
  File destination=new File(path);
  
  FileHandler.copy(source, destination);
  
  
  
	
}
}
