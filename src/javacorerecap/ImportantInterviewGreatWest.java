package javacorerecap;

import java.util.regex.Pattern;

class A {
	static int i=10;
	
	public void getD(){
		int i=20;
		System.out.println(A.i);
		System.out.println("The value of I is ="+i);
		
	}
}

public class ImportantInterviewGreatWest {

	public static void main(String[] args) {
		A ob = new A();
		
		ob.getD();
		System.out.println("fddfffdfd");
		System.out.println("\fa");
		System.out.println("a\"+\"b".length());
		System.out.println("\"Hello\"");
		System.out.println("fddfffdfd");
//Print two times character
		String str="this";
		String newstr="";
		  for(int i=0;i<str.length();i++){
		    newstr = newstr+str.charAt(i)+str.charAt(i);
		  }
		  System.out.println(newstr);
		  
//Return the number of times that the string "hi" appears anywhere in the given string
		  System.out.println(countHi("abc hi hi ho"));
		System.out.println(catDog("catdogdogcatfgg"));
		System.out.println(countCode("cozexxcope"));
		int [] arr={1,2,3};
		int [] out=rotateLeft3(arr);
		System.out.println(out[0]+","+out[1]+","+out[2]);
		
		System.out.println(countxyz("xyzabcxyzcde.xyz"));

	}
	
	public static int countHi(String str) {
		  int count=0;
		 for(int i=0;i<str.length()-2;i++){
		   String substr= str.substring(i,i+2);
		   if(substr.equalsIgnoreCase("hi")){
			   count++;
		   }
		 }
		 
		 return count;
		}
//	Return true if the string "cat" and "dog" appear the same number of times in the given string.
	public static boolean catDog(String str) {
		int catcount=0,dogcount=0;
		for(int i=0;i<str.length()-2;i++){
		String substr=str.substring(i,i+3);  
		if(substr.equalsIgnoreCase("cat")){
			catcount++;
		}
		else if(substr.equalsIgnoreCase("dog")){
			dogcount++;
		}
		
		}
		return catcount==dogcount;
	}

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	public static int countCode(String str) {
		int count=0;
		for(int i=0;i<str.length()-3;i++){
		   String newstr=str.substring(i,i+2)+str.substring(i+3,i+4);
		   if(newstr.equalsIgnoreCase("coe")){
			   count++;
		   }
		}
		return count;
	}
//Given an array of length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//rotateLeft3([1, 2, 3]) [2, 3, 1]
	public static int[] rotateLeft3(int[] nums) {
		  int [] tk = new int[nums.length];
		  tk[nums.length-1]=nums[0];
		  for(int i=0;i<nums.length-1;i++){
		    tk[i]=nums[i+1];
		  }
		  return tk;
		}
   public static int countxyz(String s1){
	  int count=0;
	  for(int i=0;i<s1.trim().length()-2;i++){
		  String newstr = s1.trim().substring(i,i+3);
		  if(newstr.trim().equalsIgnoreCase("xyz")){
			  if(i!=0){
				  if(Pattern.matches("[^a-zA-Z]",String.valueOf(s1.charAt(i-1)))){
					  count--;
				  }
			  }
				 
			  count++;
			  
		  }
	  }
	  return count;
   }
   
	
}
