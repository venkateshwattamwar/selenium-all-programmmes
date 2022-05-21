package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@name='searchBtn']")).click();
		
		String gettext=driver.switchTo().alert().getText();
		
		System.out.println(gettext);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
	}
	
}
