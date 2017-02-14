package javacorerecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitFluent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/Automation/NewTest2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
        // Maximize browser

       driver.manage().window().maximize();

  // Start the application 

  driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

//Click on timer so clock will start

       driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

	}

}
