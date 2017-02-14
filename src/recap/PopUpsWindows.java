package recap;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PopUpsWindows {

	public static void main(String[] args) {
		WebDriver dr= new FirefoxDriver();
		
		dr.get("http://demo.guru99.com/popup.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent;
	
		try {
			parent = dr.getWindowHandle();
			dr.findElement(By.partialLinkText("Click Here")).click();
			Set<String> winlist = dr.getWindowHandles();
			for(String child:winlist){
				if(!child.equalsIgnoreCase(parent)){
					dr.switchTo().window(child);
					WebDriverWait wait = new WebDriverWait(dr,10);
					WebElement btnclk= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[@value='Submit']")));
					dr.findElement(By.xpath(".//input[@name='emailid']")).sendKeys("kreetanshu@gmail.com");
					btnclk.click();
					System.out.println("Submitted the email id");
					captureScreen(dr);
					dr.close();
				}
			}
			dr.switchTo().window(parent);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			

	}
	public static void captureScreen(WebDriver dr){
		TakesScreenshot ts= (TakesScreenshot)dr;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("C:/selenium/WindosPopup_"+System.currentTimeMillis()+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
