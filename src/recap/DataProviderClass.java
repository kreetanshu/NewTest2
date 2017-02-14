package recap;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

@DataProvider(name="SearchProvider")
public static Object [][] getData(Method m){
	
	if(m.getName().equalsIgnoreCase("testMethodA")){
		return new Object[][]{
			 { "Guru99", "India" },
             { "Krishna", "UK" },
             { "Bhupesh", "USA" }

		};}
	else{
		 return new Object[][] {
             { "Canada" },
             { "Russia" },
             { "Japan" }
            };
	     }
	}
	
}

