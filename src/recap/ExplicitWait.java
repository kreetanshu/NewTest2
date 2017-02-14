package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver dr;
@Test
public void explicitWait(){
	dr = new FirefoxDriver();
	dr.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	dr.findElement(By.xpath(".//*[text()='Click me to start timer']")).click();
	WebDriverWait wait = new WebDriverWait(dr,10);
	WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='WebDriver']")));
    System.out.println(ele.isDisplayed());
    
}
}
