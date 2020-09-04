package day20Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter //whatever Listenr u create should extend from TestListenerAdapter
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test method has started, this is coming from Listner");
	}
	
	public void onTestSuccess(ITestResult tr)  // I am overriding the onTestSuccess of TestListenerAdapter
	{
		System.out.println("Test method has passed, this is from Listener class");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test method failed, this is coming from Listner");
	}	
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test method skipped,this is coming from Listner");
	}
	
}
