package TestNGClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TempClass {

	public static void main(String[] args) {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.get("http://www.github.com");
		dr.findElement(By.linkText("Sign in")).click();
		dr.findElement(By.id("login_field")).sendKeys("kreetanshu");
		dr.findElement(By.id("password")).sendKeys("Rails@1234");
		dr.findElement(By.name("commit")).click();
		try {
			WebElement ele=dr.findElement(By.xpath("html/body/div[2]/div/ul[2]/li[3]"));
			Actions act = new Actions(dr);
			act.moveToElement(ele).build().perform();
			Thread.sleep(2000);
			act.click(ele).build().perform();
			Thread.sleep(2000);
			System.out.println(dr.findElement(By.xpath(".//*[@id='user-links']/following::button[contains(text(),'Sign out')]")).getText());
			//dr.findElement(By.xpath(".//*[@id='user-links']/following::button[contains(text(),'Sign out')]")).click();
			dr.findElement(By.xpath(".//*[@id='user-links']/li[3]/div/div/form/button")).click();
			dr.findElement(By.linkText("Sign in")).click();
			dr.findElement(By.id("login_field")).sendKeys("kreetanshu");
			dr.findElement(By.id("password")).sendKeys("Rails@1234");
			dr.findElement(By.name("commit")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
