package TestNGClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript {
    
	@Test
	public void test001(){
		System.out.println("My First Test");
		Reporter.log("Method executed log captured",true);
	}
	
	@Test
	public void test002(){
		System.out.println("My Second Test");
		
	}
	
	@Test
	public void test003(){
		System.out.println("My Third Test");
	}
}
