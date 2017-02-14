package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators {
	public static WebDriver dr;
	@BeforeTest
	public void openUrl(){
		 dr = new FirefoxDriver();
	     dr.get("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\Sample.html");
	     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testAnchor(){
		Actions bld = new Actions(dr);
		JavascriptExecutor js = (JavascriptExecutor) dr;
		String title = (String) js.executeScript
		("return document.title");
		System.out.println("****  "+title);
		
	}
}
