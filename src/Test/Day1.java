package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	//@Test(groups= {"Regression"})
	@Test(enabled=false)	//To disable a method during execution
	public void priyank()
	{
		System.out.println("Test 1.1");
		
	}
	
	//@Test(timeOut=4000)
	@Test(dataProvider="getData")
	public void test2(String username, String password) 
	{
		System.out.println("Test 1.2");
		System.out.println("The username is: "+username);
		System.out.println("The password is: "+password);
		System.out.println("New Line added");
		System.out.println("New Line added");
		System.out.println("New Line added");
		System.out.println("New Line added");
		//New line added 
		//New line added
		//New line added
	}
	
	@Parameters({"URL","APIKey"})
	@Test
	public void priyank2(String urlname, String key)
	{
		System.out.println("1.3 is here");
		System.out.println(urlname);
		System.out.println("API Key is: "+key);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history
		//2nd combination - username password - No credit history
		//3rd combination - fraudulent history - Fraudulent credit history
		Object[][] data = new Object[3][2]; //3 is the number of combination and 2 is the number of variables in each combination
		
		//1st combination
		data[0][0]= "Fristsetusername";	//1st combination, 1st variable
		data[0][1]= "Firstsetpassword";	//1st combination, 2nd variable
		
		//2nd combination
		data[1][0] = "Secondsetusername"; //2nd combination, 1st variable
		data[1][1] = "Secondsetpassword"; //2nd combination, 2nd variable
		
		//3rd combination
		data[2][0] = "Thirdsetusername"; //3rd combination, 1st variable
		data[2][1] = "Thirdsetpassword"; //3rd combination, 2nd variable
		
		return data;
	}
}
