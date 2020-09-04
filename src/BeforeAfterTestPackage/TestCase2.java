package BeforeAfterTestPackage;

import org.testng.annotations.*;


public class TestCase2 
{
	@Test
	void method4()
	{
		System.out.println("This is  method4");
	}
	
	@Test
	void method5()
	{
		System.out.println("This is  method5");
	}
	
	@Test
	void method6()
	{
		System.out.println("This is  method6");
	}
	
	@AfterTest
	void Logout()
	{
		System.out.println("This is  Logout");
	}
	
	
}
