package TestGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {

	@Test(groups={"Smoke"})
    public void login(){
        
        System.out.println("Login done");
        System.out.println("Smoke Scenario passed");
    }
    
    @Test(groups={"Regression"})
    public void register(){
        System.out.println("Registration done");
    }
    @Test(groups={"Regression"})
    public void register12(){
        System.out.println("Registration 12 done");
        Reporter.log("Regression Test Completed",true);
    }
    @Test(groups={"Smoke"})
    public void login12(){
        
        System.out.println("Login12 done");
        System.out.println("Smoke Scenario 2 passed");
        Reporter.log("Smoke Test Completed",true);
    }
}
