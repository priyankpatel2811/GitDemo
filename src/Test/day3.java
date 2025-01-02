package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(groups= {"Regression"})
	public void WeblogincarLoan()
	{
		System.out.println("Test 3.1");
		Assert.assertTrue(false);
	}
	
	@Parameters({"secondURL"})
	@Test
	public void MobileLogincarLoan(String url2)
	{
		System.out.println("Test 3.2");
		System.out.println(url2);
	}
	
	@Test(dependsOnMethods= {"MobileLogincarLoan"})
	public void LoginAPIcarLoan()
	{
		System.out.println("Test 3.3");
	}
	
	@AfterTest
	public void lastTest()
	{
		System.out.println("This should be executed at the end");
	}
	
	@AfterSuite
	public void verylasttest()
	{
		System.out.println("This should be last no matter what");
	}
	
	@BeforeMethod
	public void everymethod()
	{
		System.out.println("Before test day 3");
	}
	
	@AfterClass
	public void firstclass()
	{
		System.out.println("This should be Last class");
	}
}
