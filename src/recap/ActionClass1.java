package recap;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ActionClass1 {
	WebDriver dr;
@Test
public void preReq() throws InterruptedException{
	dr = new FirefoxDriver();
	dr.get("http:////www.naukri.com");
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	String currentWindowId = dr.getWindowHandle();
	Set<String> wins= dr.getWindowHandles();
	for(String l1:wins){
		if(!currentWindowId.equals(l1)){
			dr.switchTo().window(l1);
			System.out.println(dr.switchTo().window(l1).getTitle());
			dr.close();
			 
		}
		
		//dr.switchTo().window(l1.toString()).close();
	}
	Thread.sleep(2000);
	dr.switchTo().window(currentWindowId);
	String currentWindowId2 = dr.getWindowHandle();
	System.out.println(dr.switchTo().window(currentWindowId2).getTitle());
	//dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(dr,30);
	WebElement ele2 = wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input"))));
	ele2.sendKeys("test");
	
	Actions builder= new Actions(dr);
	// find the element which we want to Select from auto suggestion
	WebElement ele=dr.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));
	builder.moveToElement(ele).build().perform();
	
	// Give wait for 2 seconds 
	Thread.sleep(2000);
	
	builder.click().build().perform();
	
	
}
}
