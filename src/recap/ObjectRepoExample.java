package recap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjectRepoExample {
	static WebDriver dr;
	@BeforeTest
	public void openBrowser(){
		dr=new FirefoxDriver();
		dr.get("http://facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    
	@Test
	public static void tc_01() throws IOException {
		// TODO Auto-generated method stub
		File fn = new File("C:\\Users\\rahul\\Desktop\\Selenium_Reetanshu\\object.repo.properties");
		FileInputStream src = new FileInputStream(fn);
		Properties prop = new Properties();
		prop.load(src);
		
		dr.findElement(By.xpath(prop.getProperty("facebook.login.username.xpath"))).sendKeys("kreetanshu@gmail.com");
		dr.findElement(By.xpath(prop.getProperty("facebook.login.password.xpath"))).sendKeys("Awarrior");
		dr.findElement(By.xpath(prop.getProperty("facebook.login.Signup.xpath"))).click();
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println(dr.getTitle());
	}

}
