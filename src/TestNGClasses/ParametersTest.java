package TestNGClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParametersTest {
    @Parameters({"suite-level-params"})
	@Test
	public void firstTest(String params){
		System.out.println("This is first method and the value of params"+params);
	}
    @Parameters({"test-level-params"})
	@Test
	public void secondTest(String params){
		System.out.println("This is first method and the value of params"+params);
	}
    @Parameters({"suite-level-params","test-level-params"})
    @Test
	public void thirdTest(String params1,String params2){
		System.out.println("This is first method and the value of params"+params1+"****"+params2);
	}
}
