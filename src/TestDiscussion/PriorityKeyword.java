package TestDiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login to application");
	}
	@Test(priority=10)
	public void dashBoard()
	{
		System.out.println("Dashboard test case");
	}
	@Test(priority=2)
	public void profile()
	{
		System.out.println("profile test case");
	}
	@Test(priority=3)
	public void home()
	{
		System.out.println("home test case");
	}
	@Test
	public void logout()
	{
		System.out.println("logout test case");
	}
	@Test
	public void make()
	{
		System.out.println("make test case");
	}
	@Test(priority=-20)
	public void direct()
	{
		System.out.println("direct test case");
	}
		
	//Note:-->
     //1)we can decide the order of execution based on priority keyword
	//2)priority of test case can be duplicate in that case duplicate priority test case can be executed in dictionary orde
	//3)priority of test case can not be fraction
	//4)it is not neccesary to priority in sequence
	//5)priority of test case negative as well

}
