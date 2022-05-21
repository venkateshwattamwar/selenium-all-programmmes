package TestDiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	
	@Test(groups="functional")
	public void Admin()
	{
		System.out.println("Admin test case");
	}
    @Test(groups="Sanity")
    public void myinfo()
    {
    	System.out.println("myinfo test cases");
    }
    @Test(groups="Regression")
    public void Buyshres()
    {
    	System.out.println("buyshares test case");
    }
    @Test(groups="Regression")
    public void sellshares()
    {
    	System.out.println("sellshares test case");
    }
    @Test(groups="Sanity")
    public void searchShares()
    {
    	System.out.println("searchshares test case");
    }
	
}
