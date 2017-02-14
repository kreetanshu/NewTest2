package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPop {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.get("file:///C://Users//rahul//Desktop//Selenium_Reetanshu//Sample.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.navigate().refresh();
		dr.findElement(By.xpath(".//button[contains(text(),'Confirm Box')]")).click();
		
		isAlertPresent(dr);
		

	}
	
	public static void isAlertPresent(WebDriver dr){
		try {
			Alert al= dr.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The alert is not present");
		}
	}

}
