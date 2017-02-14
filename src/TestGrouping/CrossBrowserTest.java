package TestGrouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
   static WebDriver dr;
	@BeforeTest
	@Parameters("DriverName")
	public void openBrowser(String br){
		if(br.equalsIgnoreCase("firefox")){
		dr= new FirefoxDriver();
		Reporter.log("Firefox Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
		}
		else{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			dr= new ChromeDriver();
			Reporter.log("Chrome Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
		}
		dr.get("file:///C:/Users/rahul/Desktop/Selenium_Reetanshu/Sample.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void executeStep1(){
		dr.findElement(By.xpath(".//input[@value='female']"));
	}
	
	
}
