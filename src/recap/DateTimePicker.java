package recap;


import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DateTimePicker {
   static WebDriver dr;
	@Test
    public void testDAtePicker() throws Exception{
		dr= new FirefoxDriver();
		String dateTime ="12/07/2014 2:00 PM";
		dr.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement nextLink = dr.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
	    //button to click in center of calendar header
	    WebElement midLink = dr.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));
	    //button to move previous month in calendar
	    WebElement previousLink = dr.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 
	    String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
	    int yeardiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
	    midLink.click();
	    if(!(yeardiff == 0)){
	    	if(yeardiff>0){
	    		for(int i=0;i<yeardiff;i++){
	    			nextLink.click();
	    		}
	    	}
	    	else{
	    		for(int i=0;i<yeardiff*(-1);i++){
	    			previousLink.click();
	    		}
	    	}
	    	
	    }
	    List<WebElement> list_AllMonthToBook = dr.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
          list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
          Thread.sleep(1000);
        //get all dates from calendar to select correct one
        List<WebElement> list_AllDateToBook = dr.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
          list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();

	}

}
