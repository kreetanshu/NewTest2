import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.Windows;

import org.openqa.selenium.OutputType;

public class Stest1 {
	public static WebDriver dr = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		  dr.get("http://www.makemytrip.com");
		  
		  
		  
		  
		  
		 WebElement el= dr.findElement(By.partialLinkText("Flights"));
		  Actions act = new Actions(dr);
		 		  
		  act.moveToElement(el).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //File src= ((TakesScreenshot)dr).getScreenshotAs(OutputTye.FILE);
		  Thread.sleep(6000);
		  Set<String> wnlist = dr.getWindowHandles();
		  for(String wn:wnlist){
			if (dr.switchTo().window(wn).getTitle().contains("Flight Ticket")){
				dr.switchTo().window(wn);	
		   Stest1.screen();
			}
		  }

	   
	}
public static void screen(){
	 File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE); 
	    try {
			FileUtils.copyFile(src,new File("C:/selenium/"+System.currentTimeMillis()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
