package day20Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest 
{

	@Test
	void setup() //fail
	{
		Assert.assertTrue(false);   // I need to perform some action, which I will define in Listner Class
	}
	
	@Test //pass
	void loginByEmail()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"setup"})  //skipped
	void loginByFacebook()
	{
		Assert.assertTrue(true);
	}
}