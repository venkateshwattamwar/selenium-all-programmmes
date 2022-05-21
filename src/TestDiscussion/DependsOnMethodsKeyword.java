package TestDiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsKeyword {
	
	@ Test(priority=1)
	public void loginTest()
	{
		System.out.println("login to application");
		
	//	throw new ArithmeticException();
		Assert.fail("testcase failing delibrately");
	}
	@Test(priority = 2,dependsOnMethods = "loginTest")
	public void homepage()
	{
		System.out.println("homepage of application");
	}
	@Test(dependsOnMethods = {"homepage","loginTest"},priority = 3)
	public void logout()
	{
		System.out.println("logout from application");
	}
	

}
