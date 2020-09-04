package day19TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterUsingXML 
{
	@Parameters({"a","b"})
	@Test
	void m1(String s1 , String s2)
	{
		System.out.println(s1 + " " + s2);
		//Assert.assertTrue(true);
	}
	
	void m2()
	{
		
	}
}
