package pageScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PageScroll 
{
	 @Test		
	    public void Login() throws InterruptedException 					
	    {		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\Downloads\\drivers\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://moneyboats.com/");			
	     
	        //Maximize window		
	        driver.manage().window().maximize();		
	        		
	        //Vertical scroll down by 600  pixels		
	        //js.executeScript("window.scrollBy(0,800)"); // scroll with pixels
	        
	        //js.executeScript("scrollTo(0,document.body.scrollHeight)");  //scroll to the last
	        
	        
	        for(int i=0;i<6000;i++) 
	        {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
		    }  
	        
	        Thread.sleep(5000);
	        
	        
	        
	        
	        
      
	        
	    }
	 
	
}
