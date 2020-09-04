package day22PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LoginTest 
{

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	void login()
	{
		LoginPage lp=new LoginPage(driver); // Create a object of Page object Model Class, initiallizes all the elements in POM class
		
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();
	}
	
	@AfterClass
	void TearDown()
	{
		driver.quit();
	}
	
}
