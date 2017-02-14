package recap;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame {

	public static void main(String[] args) throws Exception {
		WebDriver dr = new FirefoxDriver();
		dr.get("file:///C://Users//rahul//Desktop//Selenium_Reetanshu//Sample.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		
		
		try {
			
			WebDriverWait wait = new WebDriverWait(dr,15);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
			dr.findElement(By.xpath(".//a[contains(@title,'tutorials')]")).click();
			
			dr.findElement(By.xpath(".//form[@class='searchform']/input[@name='q']")).sendKeys("java");
			dr.findElement(By.className("search-butn")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("switching to frame");
	    dr.switchTo().defaultContent();
	    //dr.findElement(By.partialLinkText("Book Flight")).click();
		
		
		
		

	}

}
