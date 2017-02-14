package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassKeyEvent {

	@Test
	public void rightClick(){
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://google.com");
	 
	driver.manage().window().maximize();
	 
	Actions act=new Actions(driver);
	
	
	act.contextClick(driver.findElement(By.xpath(".//*[@id='_eEe']/a[6]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	}

}
