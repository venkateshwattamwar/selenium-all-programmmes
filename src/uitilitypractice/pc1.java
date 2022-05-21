package uitilitypractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pc1 {
	
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://wynk.in/music");
       
       scrennshotinpc.capcturescreenshot(driver, "sc2");
       
	}
	
	
	

}
