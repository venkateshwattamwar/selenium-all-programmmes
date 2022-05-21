package TestDiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase1 {
	
	@Test(groups={"Sanity","Regression"})
	public void login()
	{
		System.out.println("login to application");
	}
    @Test(groups="Sanity")
    public void dashbord()
    {
    	System.out.println("dashbord test cases");
    }
    @Test(groups= {"Regression","functional"})
    public void profile()
    {
    	System.out.println("profile test case");
    }
    @Test(groups= {"functional","Sanity","Regression"})
    public void home()
    {
    	System.out.println("home test case");
    }
    @Test(groups= {"Sanity"})
    public void logout()
    {
    	System.out.println("logout test case");
    }
	
}
