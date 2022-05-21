package TestDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	@Test
	public void verifyUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://www.facebook.com/");
		
		String Url = driver.getCurrentUrl();
		
		
		String expectedUrl="facebooke";
		
		boolean ispresent = Url.contains(expectedUrl);
		
		SoftAssert sa =new SoftAssert();
		
	    sa.assertTrue(ispresent, "test case is failed please file a bug");
	    
	    System.out.println("after assertion statement");
	    
	    System.out.println("after assertion statement 2 ");
	    
	  //  sa.assertAll();
	}
//	soft assert:-soft assert allow the test case to move further even if the assertion got failed and continue to the execution till  we call aseertall()  method 
//if we dont call assertall () then it will not mark the status on the basis of assertion. it follow the default behavior for a test case
	

}
