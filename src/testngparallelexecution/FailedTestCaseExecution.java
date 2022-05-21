package testngparallelexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExecution {
	
//	failed test case execution:-we can execute the failed test case in the testng-failed.xml
//NOTE:-to execute the skipped test case we have to execute the same testng-filed.xml fole then it will
	//   execute only failed test cases and those which got skipped
	
	@Test
	public void login()
	{
		System.out.println("login to application");
		
		Assert.assertEquals(false, true);
	}
	@Test
	public void dashbord()
	{
		System.out.println("dashbord test case");
	}
   @Test(dependsOnMethods = "login")
   public void profile()
   {
	   System.out.println("profile to application");
   }
   @Test
   public void logout()
   {
	   System.out.println("logout test case");
   }
}
