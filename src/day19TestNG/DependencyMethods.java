package day19TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods 
{
	@Test (priority = 1)
	void openURL()
	{
		System.out.println("This is open URL method"); // Assert Command is used for pass or fail 
		Assert.assertTrue(true);  // this signifies test has passed
	}
	
	@Test (priority = 2, dependsOnMethods = {"openURL"})
	void login()
	{
		System.out.println("This is Login method");
		Assert.assertTrue(true);  // when we get exceptions this is the same thing behind the scenes
	}
	
	
	@Test (priority = 3, dependsOnMethods = {"login"}, enabled = false)  // You can always disable the method...
	void search()
	{
		System.out.println("This is Login method");
		Assert.assertTrue(false);  // when we get exceptions this is the same thing behind the scenes
	}
	
	@Test (priority = 4,dependsOnMethods = {"openURL","login"})
	void logout()
	{
		System.out.println("This is Logout method");
		Assert.assertTrue(true);
	}
}
