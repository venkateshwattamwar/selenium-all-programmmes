package testngparallelexecution;

import org.testng.annotations.Test;

public class ParallelTestClass2 {

	@Test
	public void profile()
	{
		System.out.println("profile test case");
	}
	@Test
	public void logout()
	{
		System.out.println("logout test case");
	}
}
