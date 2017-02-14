import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;

public class CaptureScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Firefox
		 WebDriver driver=new FirefoxDriver();
		 
		// call method
		 CaptureScreen.captureScreenShot(driver);
		 
		// Maximize the window
		driver.manage().window().maximize();
		                        CaptureScreen.captureScreenShot(driver);
		 
		// Pass the url
		driver.get("http://www.google.com");
		 CaptureScreen.captureScreenShot(driver);
		 
	}
	public static void captureScreenShot(WebDriver ldriver){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));                             
		} catch (IOException e) 
		{
		  System.out.println(e.getMessage()) ;
		 }
		
		  }
}


	 
	
