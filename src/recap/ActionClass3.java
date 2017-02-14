package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {

	public static void main (String[] args) {
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://jqueryui.com/slider/");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement el= dr.findElement(By.xpath(".//*[@id='slider']/span"));
		try {
			dr.switchTo().frame(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement el= dr.findElement(By.xpath(".//*[@id='slider']/span"));
		Actions act = new Actions(dr);
		el.click();
		act.dragAndDropBy(el, 900, 0);

	}

}
