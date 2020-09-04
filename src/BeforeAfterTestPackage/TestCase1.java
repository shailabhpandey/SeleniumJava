package BeforeAfterTestPackage;

import org.testng.annotations.*;

public class TestCase1 
{
	@Test
	void method1()
	{
		System.out.println("This is  method1");
	}
	
	@Test
	void method2()
	{
		System.out.println("This is  method2");
	}
	
	@Test
	void method3()
	{
		System.out.println("This is  method3");
	}
	
	@BeforeClass
	void Login()
	{
		System.out.println("This is  Login");
	}
	
}
