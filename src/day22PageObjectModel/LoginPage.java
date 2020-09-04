package day22PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver)  // Create a constructor and pass the webdriver reference
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);  // this refers to current object of class		
	}	

	
//	@FindBy(how=How.ID, using="txtUsername") //way2
//	WebElement txtusername;
	
	
	@FindBy(name="txtUsername")    //way1
	WebElement txtusername;   // Defining a varibale
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	//String str ;
	
	@FindBy(id="txtPassword")
	WebElement txtpassword;
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	
	@FindBy(id="btnLogin")
	WebElement btnsignin;
	public void clickSubmit()
	{
		btnsignin.click();
	}

	
	
	
	
	
	
	
}
