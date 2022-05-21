package TestDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
//	@Test
//	public void verifyUrl()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
//		
//		
//		WebDriver driver = new ChromeDriver();// chrome browser will get open
//		
//		driver.manage().window().maximize();// to maximize the window
//		
//		driver.get("https://www.facebook.com/");
//		
//		String url = driver.getCurrentUrl();
//		
//		String expectedurl="facebooke";
//		
//		boolean ispresent = url.contains(expectedurl);
//		
//		Assert.assertTrue(ispresent, "test case is fail please file a bug");//false jal tr message console madhe print karel
//		//Hard assert:-hard assert will not allow the test case to execute the further steps if the assertion got failed
//		
//		
//	}
	
	@Test
	public void verifyValues()
	{
		String actualvalue="Velocity";
		
		String expectedvalue="velocity";
		
//		Assert.assertFalse(false, expectedvalue);//this is marking the test case as passed(after passing statement below value execute)
		
		Assert.assertEquals(actualvalue, expectedvalue);//this will mark the test case as failed
		
		System.out.println("after assertion statement");
	}
    @Test
    public void assrtfalsecondition()
    {
    	Assert.assertFalse(false, "tets case get fail");
    }
}
