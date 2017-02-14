package recap;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FuentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver dr = new FirefoxDriver();
          
          dr.get("http://www.guru99.com/");
          dr.manage().window().maximize();
          String atitle= dr.getTitle();
          
          if(atitle.contains("Meet Guru99")){
        	  System.out.println("test passed");
          }
          else{
        	  System.out.println("test failed");
          }
          
          Wait<WebDriver> wt= new FluentWait<WebDriver>(dr).withTimeout(30, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS);
	      WebElement el = wt.until(new Function<WebDriver,WebElement>(){
	    	  public WebElement apply(WebDriver dr){
	    		  return dr.findElement(By.xpath(".//*[@id='rt-header']/div/div[2]/div[1]/ul/li[2]/div/div[1]/ul/li[1]/a"));
	    	  }
	    	   
	      });
	      el.click();
	    		  
	    		  
	    
	}

}
