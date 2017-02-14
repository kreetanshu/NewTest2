package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDowns {
	public static WebDriver dr;
	@BeforeTest
	public void openUrl(){
		 dr = new FirefoxDriver();
	     dr.get("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\Sample.html");
	   
	}
	@Test
	public void testDropDown(){
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     Select make = new Select(dr.findElement(By.xpath(".//select[@id='c1']")));
     make.selectByVisibleText("Casual Shoes");
     Assert.assertEquals("Casual Shoes", make.getFirstSelectedOption().getText());
     Assert.assertFalse(make.isMultiple());
     List<String> expec_option = Arrays.asList(new String[]{"Sport Shoes","Casual Shoes","Formal Shoes"});
     List<String> act_option = new ArrayList<String>();
     for(WebElement el:make.getOptions()){
    	 act_option.add(el.getText());
     }
      Assert.assertEquals(expec_option.toArray(),act_option.toArray(),"Match Not Found"); 
     
		
	}
	@Test
	public void testMultipleSelect(){
		Select make = new Select(dr.findElement(By.xpath(".//select[@id='c2']")));
		make.selectByIndex(0);
		make.selectByIndex(1);
		make.selectByIndex(2);
		for(WebElement el:make.getAllSelectedOptions()){
			System.out.println(el.getText());
		}
	}
	
	@AfterTest
	public void closeBrowser(){
		dr.close();
	}
	
}
