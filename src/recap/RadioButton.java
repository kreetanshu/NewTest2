package recap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton {

	public static WebDriver dr;
	@BeforeTest
	public void openUrl(){
		 dr = new FirefoxDriver();
	     dr.get("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\Sample.html");
	     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testAnchor(){
		List<WebElement> rbtn= dr.findElements(By.name("mstatus"));
		for(WebElement el:rbtn){
			if(el.getAttribute("value").equalsIgnoreCase("female") && !el.isSelected()){
				el.click();
			}
		}
		WebElement e1=dr.findElement(By.xpath(".//input[@type='radio'][@value='female']"));
		System.out.println(e1.isSelected());
		
	}
	@AfterTest
	public void closeBrowser(){
		dr.quit();
	}
}
