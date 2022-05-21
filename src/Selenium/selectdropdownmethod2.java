package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class selectdropdownmethod2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569867%7Ce%7Cfacebook%20sign%20up%20new%20account%7C&placement=&creative=589460569867&keyword=facebook%20sign%20up%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-26007876572%26loc_physical_ms%3D9062106%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw9LSSBhBsEiwAKtf0n9Aufm01DucXogtybp03Vxwpk-qiQ7IUWsqJmdxqQh7anOzmjl-v6RoCy4UQAvD_BwE");
	
      // WebElement day=d.findElement(By.xpath("//*[@id='day']"));
        
       // Select a=new Select (day);
      //  a.selectByVisibleText("20");
       // a.selectByValue("8");
      //  a.selectByIndex(10);
        
        
//      WebElement month=d.findElement(By.xpath("//*[@title='Month']"));
//        
//       Select b=new Select(month);
//        b.selectByVisibleText("Feb");
//        b.selectByValue("2");
//        b.selectByIndex(2);
		
		
	//	WebElement year =d.findElement(By.xpath("//*[@class='_9407 _5dba _9hk6 _8esg'][3]")) ;
		
	//	Select c=new Select(year);
	//	c.selectByVisibleText("1925");
	//	c.selectByValue("2014");
	//	c.selectByIndex(10);
		
		
        
        
	
	}

}
