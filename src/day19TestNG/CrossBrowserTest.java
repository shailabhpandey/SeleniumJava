package day19TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver=null;	
	
	@Parameters("browser")
	
	@Test(priority=1)	
	public void launchbrowser(String browser) 
	{

		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\Downloads\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\pande\\Downloads\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@Test(priority=2)
	public void verifyTitle() 
	{		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;

		//password 

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");		

		//Login Button

		driver.findElement(By.id("btnLogin")).click();	
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");  // compares to titles
	}

//	@Test(priority=3)
//	public void registration() 
//	{
//
//		Assert.assertTrue(true);
//		//write code for registration process
//	}

	@Test(priority=3)
	public void closeBrowser() 
	{

		driver.close();
	}

}
