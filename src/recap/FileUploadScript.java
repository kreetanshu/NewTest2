package recap;

import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadScript {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver dr = new FirefoxDriver();
		dr.get("http://my.monsterindia.com/create_account.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.findElement(By.id("wordresume")).click();
		//Copying file path to clipboard
		StringSelection sel = new StringSelection("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\Reetanshu Kumar_Resume_Retail.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		//code for scrolling
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("scroll(0,350)");
		
		//Robot class to handle windows popup
		
		Robot rb = new Robot();
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
