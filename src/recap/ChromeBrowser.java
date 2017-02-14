package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class ChromeBrowser {
 public static WebDriver d1;
	public static void main(String[] args) {
		
			  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			 // ChromeOptions options = new ChromeOptions();
			 // options.addArguments("--disable-extensions");
			  d1 = new ChromeDriver();
			
			  d1.get("https://facebook.com");
			WebElement ele=  d1.findElement(By.xpath(".//*[@id='email']"));
			ele.sendKeys("reetanshu");
			System.out.println("The getAttribute method  "+ele.getAttribute("name"));
			System.out.println("The getCssvalue method  "+ele.getCssValue("font-size"));
			System.out.println("The getTagname method  "+ele.getTagName());
			System.out.println("The getText method  "+ele.getText());
			System.out.println("The getLocation method  "+ele.getLocation());
			
			
			  
		  /*}
		  else if(Constant.browser.equals("IE")){
			  System.setProperty("webdriver.ie.driver", ".//exe_files/IEDriverServer.exe");
			  d1=new InternetExplorerDriver();*/
		  }

	

}
