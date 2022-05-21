package TestDiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;
import utility.screenshotMethodForProject;

public class ListenerClass1 extends KiteLogin implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case passed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("test case failed"+result.getName());
	
	try {
//		utility.screenshotMethodForProject.m1(driver, "dashbord");
		utility.screenshotMethodForProject.m1(driver, result.getName());
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("test case got skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("test started"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test completed"+context.getName());
	}


	

}
