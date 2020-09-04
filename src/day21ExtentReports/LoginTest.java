package day21ExtentReports;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		
	}
	
	@Test
	public void loginTest()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123666");
		driver.findElement(By.id("btnLogin")).click();	
		Assert.assertTrue(false);  
		//Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			TakesScreenshot ts =  (TakesScreenshot) driver;  //type casting into Takescreenshot object
			
			File source = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot file
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(source, target);  // open source Jar to copy files from one folder to another... 
			System.out.println("screenshot catured");
		}
	}
}
	
	