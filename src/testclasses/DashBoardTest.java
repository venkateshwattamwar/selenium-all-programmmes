package testclasses;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest {

	@Test(priority = 3)
	public void searchValidation()
	{
		
		db.clickOnGetStarted();
		db.searchshears();
	}
	
	@Test(priority = 4)
	public void buyshearvalidation()
	{
		db.buyshears();
	}
}
