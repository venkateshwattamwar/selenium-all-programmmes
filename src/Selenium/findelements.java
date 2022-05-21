package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Chttps%20www%20facebook%20com%20sign%20up%7C&placement=&creative=589460569891&keyword=https%20www%20facebook%20com%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-323400156464%26loc_physical_ms%3D9062106%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw0a-SBhBkEiwApljU0pG7fe02PI9XIXA6jw_6uIEu8f6T4uKVk_er2anQF-zcoBedvbWsRRoCAPEQAvD_BwE");

	    d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venkatesh");
	    
	    d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("wattamwar");
	    
	 //   d.findElement(By.xpath("//select[@id='day']//option[@value='8']")).click();
	    
	   List<WebElement> m= d.findElements(By.xpath("//select[@id='day']//option"));
	   
	   for(WebElement n:m)
	   {
		   String x=n.getText();
		   System.out.println(x);
		   
		   if(x.equals("20"))
		   {
			   n.click();
		   }
	   }
	    
	}

}
