package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static void main(String[] args) {
		// This will open browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		String tooltip_msg="";
		  try {
			  WebDriverWait wait = new WebDriverWait(driver,10);
			  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
			  
			WebElement element = driver.findElement(By.id("age"));
			// Use action class to mouse hover on Text box field
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		 
		    // find the tooltip xpath
		    WebElement username_tooltip=driver.findElement(By.xpath(".//div[@class='ui-helper-hidden-accessible']/div[@style=not('display: none;')]"));
		    tooltip_msg=username_tooltip.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// Text box field, where we mouse hover
		  System.out.println("element search");
			
		 
		// Extract text from tooltip
		 
		 
		// Print the tooltip message just for our refrences
		 System.out.println("Tooltip/ Help message is "+tooltip_msg);

	}

}
