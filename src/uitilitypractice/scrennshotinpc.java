package uitilitypractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrennshotinpc {
	
	//defining the method to take the screenshot
	
	public static void capcturescreenshot(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		
		File source = scr.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\Users\\ADMIN$\\Pictures\\sql\\screenshot of selinium\\"+filename+".png";
		
		File destination=new File(path);
		
		FileHandler.copy(source, destination);
		
	}
	}


