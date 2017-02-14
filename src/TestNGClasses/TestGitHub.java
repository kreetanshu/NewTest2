package TestNGClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGitHub {

	WebDriver dr=null;
	static DataProviderExcelLib dpel = new DataProviderExcelLib();
	int cnum=1,rnum1=1,rnum3=1;
	
	@BeforeTest
	public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException{
		dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.get("http://www.github.com");
		
		String exp_title="How people build software · GitHub";
		
		try {
			Assert.assertEquals(dr.getTitle(),exp_title);
			dpel.setExcelData("Sheet2", 1, cnum, "Passed");
		} catch (Exception e) {
			System.out.println("The assertion failed for method openBrowser");
			dpel.setExcelData("Sheet2", 1, cnum, "Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_001() throws EncryptedDocumentException, InvalidFormatException, IOException{
		dr.findElement(By.linkText("Sign in")).click();
		String exp_text="Sign in to GitHub";
		try {
			Assert.assertEquals(dr.findElement(By.xpath(".//*[@id='login']/form/div[2]/h1")).getText(),exp_text);
			dpel.setExcelData("Sheet2", 2, cnum, "Passed");
		} catch (Exception e) {
			dpel.setExcelData("Sheet2", 2, cnum, "Failed");
			System.out.println("The assertion failed for method 001");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_002() throws EncryptedDocumentException, InvalidFormatException, IOException{
		dr.findElement(By.id("login_field")).sendKeys("");
		dr.findElement(By.id("password")).sendKeys("");
		dr.findElement(By.name("commit")).click();
		String expected="Incorrect username or password.";
		try {
			Assert.assertEquals(dr.findElement(By.xpath(".//*[@id='js-flash-container']/div/div")).getText(), expected);
			dpel.setExcelData("Sheet2", 3, cnum, "Passed");
		} catch (Exception e) {
			dpel.setExcelData("Sheet2", 3, cnum, "Failed");
			e.printStackTrace();
			System.out.println("The assertion failed for method test_002");
		}
	}
	
	
	
	//login test for invalid users combination
	@Test(dataProvider="feedData",dataProviderClass=DataProviderExcelLib.class,groups={"login"})
	public void test_003(String uname,String pass) throws EncryptedDocumentException, InvalidFormatException, IOException{
		//dr.get("https://github.com/session");
		WebElement username=dr.findElement(By.id("login_field"));
		WebElement password= dr.findElement(By.id("password"));
		username.clear();
		password.clear();
		username.sendKeys(uname);
		password.sendKeys(pass);
		dr.findElement(By.name("commit")).click();
		String expected="Incorrect username or password.";
		
		try {
			Assert.assertEquals(dr.findElement(By.xpath(".//*[@id='js-flash-container']/div/div")).getText(), expected);
			dpel.setExcelData("Sheet1", rnum1, 2, "Passed");
			dpel.setExcelData("Sheet2", 4, cnum, "Passed");
			rnum1++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("The assertion failed for method test_003");
			dpel.setExcelData("Sheet1", rnum1, 2, "Failed");
			dpel.setExcelData("Sheet2", 4, cnum, "Failed");
			rnum1++;
			e.printStackTrace();
		}
	
	}
	
	@Test(dataProvider="feedData",dataProviderClass=DataProviderExcelLib.class,groups={"login"})
	public void test_004(String uname,String pass) throws EncryptedDocumentException, InvalidFormatException, IOException{
		dr.get("https://github.com/session");
		WebElement username=dr.findElement(By.id("login_field"));
		WebElement password= dr.findElement(By.id("password"));
		username.clear();
		password.clear();
		username.sendKeys(uname);
		password.sendKeys(pass);
		dr.findElement(By.name("commit")).click();
		//String expected="Your repositories";
		try {
			WebElement ele=dr.findElement(By.xpath("html/body/div[2]/div/ul[2]/li[3]"));
			Actions act = new Actions(dr);
			act.moveToElement(ele).build().perform();
			Thread.sleep(2000);
			act.click(ele).build().perform();
			Thread.sleep(2000);
			//dr.findElement(By.xpath(".//*[@id='user-links']/following::button[contains(text(),'Sign out')]")).click();
			dr.findElement(By.xpath(".//*[@id='user-links']/li[3]/div/div/form/button")).click();
			Assert.assertTrue(dr.findElement(By.linkText("Sign in")).isDisplayed());
			dpel.setExcelData("Sheet3", rnum3, 2, "Passed");
			dpel.setExcelData("Sheet2", 5, cnum, "Passed");
			rnum3++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("The assertion failed for method test_004");
			dpel.setExcelData("Sheet3", rnum3, 2, "Failed");
			dpel.setExcelData("Sheet2", 5, cnum, "Failed");
			rnum1++;
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() throws EncryptedDocumentException, InvalidFormatException, IOException{
		dr.close();
		
		try {
			dpel.setExcelData("Sheet2", 6, cnum, "Passed");
		} catch (Exception e) {
			dpel.setExcelData("Sheet2", 6, cnum, "Failed");
			e.printStackTrace();
		} 
	}
	

}
