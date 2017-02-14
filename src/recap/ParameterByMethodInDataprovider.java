package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ParameterByMethodInDataprovider {
	WebDriver driver;

    @BeforeTest
    public void setup(){

     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.get("https://google.com");
     }
    
    @Test(dataProvider="SearchProvider",dataProviderClass=DataProviderClass.class)
    public void testMethodA(String author,String searchKey) throws InterruptedException{
    	 WebElement searchText = driver.findElement(By.name("q"));
    	 searchText.sendKeys(searchKey);
    	 System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
         Thread.sleep(3000);
         String testValue = searchText.getAttribute("value");
         System.out.println(testValue +"::::"+searchKey);
         searchText.clear();
         Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));

      }
    @Test(dataProvider="SearchProvider",dataProviderClass=DataProviderClass.class)
    public void testMethodB(String searchKey) throws InterruptedException{
            WebElement searchText = driver.findElement(By.name("q"));
            searchText.sendKeys(searchKey);
            System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
            Thread.sleep(3000);
            String testValue = searchText.getAttribute("value");
            System.out.println(testValue +"::::"+searchKey);
            searchText.clear();
            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));

            }

    
    
    
    
}
