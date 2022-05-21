package TestDiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotatinInTesting {
//NOTE:-->1)@BeforeMethod:-this will execute before the execution of every test case of that class
	//2)@Aftermethod:-this will execute after the execution of every test case of that class 
	//3)@Beforeclass:-this will execute before the execution of any thing from a class 
	//4)@AfterClass:-this will execute after the execution of everything from a class
	//@BeforeTest:-this will execute before the execution of any thing from a class
	//6)@AfterTest:-this will execute after the execution of anything from any class
	
	@Test
	public void login()
	{
		System.out.println("this is login test case");
	}
	@Test
	public void profile()
	{
		System.out.println("this is profile method");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("this is before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("this is after method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("this is before class");
	}
	@AfterClass
	public void ac()
	{
	System.out.println("this is after class");	

	}
	@BeforeTest
	public void bt()
	{
		System.out.println("this is before test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("this is after test");
		
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suit is executing");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("after suite is executing");
	}
	
	
}
