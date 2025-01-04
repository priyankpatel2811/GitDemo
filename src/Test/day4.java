package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups= {"Regression"})
	public void WebloginHomeLoan()
	{
		System.out.println("Test 4.1.1");
	}
	public void WebloginHomeLoan123()
	{
		System.out.println("Test 4.1.2");
	}
	public void WebloginHomeLoan456()
	{
		System.out.println("Test 4.1.3");
	}
	public void WebloginHomeLoan789()
	{
		System.out.println("Test 4.1.4");
	}

	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("Test 4.2");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("Test 4.3");
	}
	
	@AfterMethod
	public void everymethod()
	{
		System.out.println("Before test day 4");
	}
	
	@BeforeClass
	public void firstclass()
	{
		System.out.println("This should be first class");
	}
}
