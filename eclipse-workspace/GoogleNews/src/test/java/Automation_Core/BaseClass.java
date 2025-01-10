package Automation_Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void base()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://news.google.com");
		
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
	
	

}
