package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsInSelenium {
	public static WebDriver dr;
	
	@Test
	public void waitTest(){
		
		dr= new FirefoxDriver();
		dr.get("http://google.com");
		WebElement ele= dr.findElement(By.name("q"));
		ele.sendKeys("Selenium");
		dr.findElement(By.xpath(".//button[@type='submit'][@name='btnG']")).click();
		WebDriverWait wait = new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.titleContains("Selenium"));
		Assert.assertTrue(dr.getTitle().toLowerCase().startsWith("selenium"));
	}

}
