package day19TestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestDDT_FB 
{
	WebDriver driver=null;	
	// this will take data from dataprovider which we created
	@Test(dataProvider="testFacebookdata")
	public void testFaceBook(String uname,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Load application
		driver.get("http://www.facebook.com");
		// clear email field
		driver.findElement(By.id("email")).clear();
		// Enter usename
		driver.findElement(By.id("email")).sendKeys(uname);
		// Clear password field
		driver.findElement(By.id("pass")).clear();
		// Enter password
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@DataProvider(name="testFacebookdata")
	public Object[][] TestDataFeed()
	{
		// Create object array with 2 rows and 2 column- first parameter is row and second is //column
//		Object [][] facebookdata=new Object[2][2];
//
//		// Enter data to row 0 column 0
//		facebookdata[0][0]="username1@gmail.com";
//		// Enter data to row 0 column 1
//		facebookdata[0][1]="Password1";
//		// Enter data to row 1 column 0
//		facebookdata[1][0]="username2@gmail.com";
//		// Enter data to row 1 column 0
//		facebookdata[1][1]="Password2";
		// return arrayobject to testscript	
		
		//Or we can write the above code in a single line
		
		String facebookdata[][]={ {"username1@gmail.com","Pass"},{"username2@gmail.com","Password246535"},{"username3@gmail.com","Password2345763535535353"}};
		
		return facebookdata;
	}

}
