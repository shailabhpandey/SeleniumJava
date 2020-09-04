package day18TestNG;

import org.testng.annotations.*;

public class AnnotationExample1 
{
	
	@AfterMethod
	void M1()
	{
		System.out.println("This is Login method");
	}
	
	
	@BeforeMethod 
	void login()
	{
		System.out.println("This is Login method");
	}
	
	@AfterMethod 
	void logout()
	{
		System.out.println("This is Logout method");
	}
	
	@Test (priority = 1 )
	void search()
	{
		System.out.println("This is search method");
	}
	
	@Test (priority = 2 )
	void advsearch()
	{
		System.out.println("This is advanced search method");
	}
	
	@Test (priority = 3 )
	void recharge()
	{
		System.out.println("This is recharge method");
	}
}
