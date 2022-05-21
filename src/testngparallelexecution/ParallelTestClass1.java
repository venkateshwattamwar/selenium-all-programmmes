package testngparallelexecution;

import org.testng.annotations.Test;

public class ParallelTestClass1 {
	
	@Test
	public void login()
	{
		System.out.println("login to application");
	}
   @Test
   public void dashbord()
   {
	   System.out.println("dashbord test case ");
   }


}
//set :-two test tags ekdach execute karnyasthi use karto