package Basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsupport2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
           //is displayed
        
        WebElement elelment = driver.findElement(By.xpath("//*[@name='actionID']"));
        
        boolean isvisible = elelment.isDisplayed();
        
        System.out.println(isvisible);//false
        
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        
        driver.findElement(By.xpath("//*[@name='Submit']")).click();
        
        driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
        
       WebElement checkbox = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[2]"));
        
        //to check the webelement is enabled
       
       boolean isenable = checkbox.isEnabled();
       
       System.out.println(isenable);//true
       
       //to check web element is selected or not
       
       boolean ischecked = checkbox.isSelected();
       
       System.out.println(ischecked);//false
       
      boolean isvisible1 = checkbox.isDisplayed();
      
      System.out.println(isvisible1);//true
      
      //clear(): this method clear the text ehich is written over the text field
       
       
        
        
        
        
	}

}
