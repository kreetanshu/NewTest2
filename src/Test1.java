import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver dr = new FirefoxDriver();
		  dr.get("http://www.redbus.in");
	      Thread.sleep(5000);
	     WebElement fr = dr.findElement(By.xpath(".//iframe[@class='modalIframe']"));
	  
	     
	     
	     
	     
	     dr.switchTo().frame(fr);
	     dr.findElement(By.xpath(".//*[@id='ctl00_body']/div[9]/div/div[2]/div[1]/div/div[2]")).click();
	     // dr.get("http://www.google.com");
	}

}
