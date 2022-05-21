package TestDiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsKeyword2 {
	
	@Test(priority = 4,dependsOnMethods ="TestDiscussion.DependsOnMethodsKeyword.homepage")
	public void profie()
	{
		System.out.println("homepage of application");
	}
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout from application");
	}
	

}
