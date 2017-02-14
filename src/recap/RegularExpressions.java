package recap;

import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		String text = "catmania thiscat thiscatmaina";
		System.out.println(Pattern.matches(".*", " "));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{1,6}", "ghf123"));//true (non-digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once) 
		System.out.println(Pattern.matches("[a]{1}[m]{2}", "amm"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?","m"));
		System.out.println(Pattern.matches("[a][n]?","an")); //a followed by n
		System.out.println(Pattern.matches("\b","m323####n"));
		
		//Case 1: At the beginning of each word

		String res=text.replace("\\bcat", "ct");
		System.out.println();
        //Now, result is "ctmania thiscat thiscatmaina"

		//Case 2: At the end of each word
         System.out.println(text.replace("cat\\b", "ct"));
        //Now, result is "catmania thisct thiscatmaina"

		//Case 3: Not in the beginning
      //  System.out.println(text.replace("/\Bcat/g", "ct"));
		//Now, result is "catmania thisct thisctmaina"

		//Case 4: Not in the end
        // System.out.println(text.replace("cat\B", "ct"));
         //Now, result is "ctmania thiscat thisctmaina"

		
		
	}

}
