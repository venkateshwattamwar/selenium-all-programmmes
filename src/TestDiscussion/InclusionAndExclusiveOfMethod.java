package TestDiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusiveOfMethod {
	
	@Test
	public void profile()
	{
		System.out.println("profile test case");
	}
	@Test(enabled=false)
	public void login()
	{
		System.out.println("login test case");
	}
	@Test
	public void home()
	{
		System.out.println("home test case");
	}

}//NOTE:-
//    Enabled keyword:-we can use enbled keyword to make a perticulaer test case disable if we write enabled =false then that 
//                     test case will not consider execution
