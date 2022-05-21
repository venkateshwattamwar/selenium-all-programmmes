package TestDiscussion;

import org.testng.annotations.Test;

public class InvocationCountkeyword {
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login to application");
	}
	@Test
	public void dashBoard()
	{
		System.out.println("Dashboard test case");
	}
	@Test(priority = 1,invocationCount = 3)
	public void profile()
	{
		System.out.println("profile test case");
	}

}//Note:-->
//1)invocation count :-->to execute test cases multiple time

