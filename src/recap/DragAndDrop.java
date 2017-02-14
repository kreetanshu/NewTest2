package recap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = dr.findElement(By.xpath(".//*[@id='draggable']/p"));
		Point point = drag.getLocation();
		String strLine = System.getProperty("line.separator");
		System.out.println("X cordinate# " + point.x + strLine + "Y cordinate# " + point.y);
		WebElement drop = dr.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions act = new Actions(dr);
		
		act.dragAndDrop(drag, drop).build().perform();
	}

}
