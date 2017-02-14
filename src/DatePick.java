import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePick {
public static WebDriver driver=new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
		 
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
	     Thread.sleep(5000);
		String month= driver.findElement(By.xpath(".//div[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		String year= driver.findElement(By.xpath(".//div[@id='ui-datepicker-div']/div/div/span[2]")).getText();
		 if (!((month.equalsIgnoreCase("Ocotber")) & (year.equalsIgnoreCase("2016")) )){
			 DatePick.checkMonth("Ocotber","2016");
		 }
		
		 
		
		 List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				System.out.println(date);
				if(date.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
				
			}
	 
	 
	 
	}
	public static void checkMonth(String month,String year) throws InterruptedException{
		Thread.sleep(5000);
	     driver.findElement(By.xpath(".//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
		//driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		String month1= driver.findElement(By.xpath(".//div[@class='ui-datepicker-title']/span[1]")).getText();
		String year1= driver.findElement(By.xpath(".//div[@class='ui-datepicker-title']/span[2]")).getText();
		if(!(month.equalsIgnoreCase(month1)&year.equalsIgnoreCase(year1))){
			checkMonth("October","2016");
		}
	   System.out.println(month1 +"   "+year1);
	 }
}
