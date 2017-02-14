package TestGrouping;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Regression {
	WebDriver dr;
	@BeforeTest
	public void openBrowser(){
	dr=new FirefoxDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Reporter.log("FireFox Brorser instantiated", true);
	}
	@Test
	public void regressionTesting(){
		Reporter.log("regression testing started", true);
	    dr.get("https://www.github.com");
		dr.findElement(By.cssSelector("a[href='/login']")).click();
		dr.findElement(By.id("login_field")).sendKeys("fgdfgg");
		dr.findElement(By.id("password")).sendKeys("fgdfgg");
		//dr.findElement(By.cssSelector("input[value='Sign in']")).click();
		dr.findElement(By.cssSelector("input[value='Sign in13331']")).click();
		Reporter.log("Sign in button clicked --End of test", true);
	}
	
	@AfterMethod
	public void captureFailedScreenShot(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(".\\TestGrouping.FailedScreenShots\\Image"+System.currentTimeMillis()+".png"));
			Reporter.log("ScreenCaptured", true);
		}
	}
	
	
}
