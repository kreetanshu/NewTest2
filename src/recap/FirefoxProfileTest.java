package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxProfileTest {

	public static void main(String[] args) throws InterruptedException {
		 FirefoxProfile profile=new FirefoxProfile();
		// profile.setEnableNativeEvents(true);
		 profile.setPreference("intl.accept_languages","jp");
		 WebDriver driver=new FirefoxDriver(profile);
		 /*driver.get("http://jqueryui.com/draggable/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Thread.sleep(6000L);
		 WebElement element=driver.findElement(By.xpath("//div[@id='draggable']"));
		 Actions actn=new Actions(driver);
		 actn.dragAndDropBy(element, 50, 50).build().perform();*/
		 driver.get("http://www.google.com");

	}

}
