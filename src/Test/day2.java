package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Regression"})
	public void test2()
	{
		System.out.println("Test 2.1");

		System.out.println("1");
	}
	
	@BeforeTest
	public void firstexecute()
	{
		System.out.println("This should be executed first");

		System.out.println("1");
	}
	
	@BeforeSuite
	public void veryfirsttest()
	{
		System.out.println("This should be first no matter what");

		System.out.println("1");
	}
	
	
}
