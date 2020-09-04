package day18TestNG;

import org.testng.annotations.Test;

public class LoginLogoutTest 
{

	//we need to apply a annotation 
	
	@Test(priority = 1)  // sequence
	void openURL()
	{
		System.out.println("This is open URL method");
	}
	
	@Test (priority = 2)
	void login()
	{
		System.out.println("This is Login method");
	}
	
	@Test (priority = 3)
	void logout()
	{
		System.out.println("This is Logout method");
	}
}
