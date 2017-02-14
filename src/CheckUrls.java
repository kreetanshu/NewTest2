import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckUrls {
	public static WebDriver dr;
	@BeforeTest
	public void openUrl(){
		 dr = new FirefoxDriver();
	     dr.get("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\Sample.html");
	     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testAnchor(){
   
	List<WebElement> li= dr.findElements(By.tagName("a"));
	
	for(WebElement list: li){
		
		System.out.println("The Url is  :  "+list.getAttribute("href"));
	}
	}
	
	@Test
	public void testTable(){
		
		List<WebElement> tables = dr.findElements(By.tagName("table"));
		System.out.println("The number of tables are  ="+ tables.size());
		
		for(WebElement ntable:tables){
			System.out.println("The Number of rows in table "+ntable.getAttribute("id")+" is "+ ntable.findElements(By.tagName("tr")).size());
		}
	}
	
	


}
