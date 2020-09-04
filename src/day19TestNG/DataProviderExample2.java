package day19TestNG;

import org.testng.annotations.*;

public class DataProviderExample2 
{
	//This test method declares that its data should be supplied by the DataProvider
	// "getdata" is the function name which is passing the data
	// Number of columns should match the number of input parameters
	
	
	@Test(dataProvider="supplyData")
	public void setData(String username, String password) // If I need to supply Multiple values to username and pass
	{
		System.out.println("your username is::"+username);
		System.out.println("your password is::"+password);
	}
	 
	@DataProvider   // we need to give this annotation for using data provider
	public Object[][] supplyData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
//	String[][] data = new String[3][2];  // declare a array
//	 
//	// 1st row
//	data[0][0] ="user1";
//	data[0][1] = "abcdef";
//	 
//	// 2nd row
//	data[1][0] ="user2";
//	data[1][1] = "xyz";
//	 
//	// 3rd row
//	data[2][0] ="user3";
//	data[2][1] = "123456";
	
	String [] [] data = { {"user1","abcdef"} ,   {"user2","xyz"}  , {"user3","123456"}  };
	 
	return data;
	}
}


