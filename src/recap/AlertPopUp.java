package recap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPopUp {
	public static WebDriver driver;
	@Test
	public void testAl() throws InterruptedException{
		driver=new FirefoxDriver();
		 
	       // Open KSRTC website
	 
	        driver.get("http://www.ksrtc.in/oprs-web/");
	        // Maximize the window
	        driver.manage().window().maximize();
	        // Click on Search Availability Service button
	        driver.findElement(By.xpath(".//input[@id='searchBtn']")).click();
	        // Switch to alert window and capture the text and print
	        
	        // Pause testcase for 5 second
	          Thread.sleep(5000); 
	        // click on ok button
	        if(isAlert(driver)){
	          Alert alt=  driver.switchTo().alert();	
	          System.out.println(alt.getText());
	          alt.accept();
	        
	        }
	        // Close browser 
	        driver.quit();
	        
	        
	}
	
	public boolean isAlert(WebDriver dr){
    	try {
			dr.switchTo().alert();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }

}
