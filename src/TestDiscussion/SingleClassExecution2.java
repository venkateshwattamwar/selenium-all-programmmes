package TestDiscussion;

import org.testng.annotations.Test;

public class SingleClassExecution2 {
	
	//test cases always get execute in the dictionary order
	
	@Test
	public void login()
	{
		System.out.println("login to application");
	}
	@Test
	public void dashBoard()
	{
		System.out.println("Dashboard test case");
	}
	@Test
	public void profile()
	{
		System.out.println("profile test case");
	}
	@Test
	public void home()
	{
		System.out.println("home test case");
	}
	@Test
	public void logout()
	{
		System.out.println("logout test case");
		
	}

}
