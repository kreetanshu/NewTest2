package javacorerecap;

import java.text.DecimalFormat;

public class InetrviewQues {

	public static void main(String[] args) {
		Integer i = new Integer(232);
		System.out.println(i.toString());
		System.out.println(String.valueOf(i));
		System.out.println(String.format ("%d", i));

		DecimalFormat obj= new DecimalFormat("#,##");
		System.out.println(obj.format(i));
		
		int [] arr = {23,12,11,33,44};
		
		System.out.println("InstanceOfjava");
        System.out.println("After Reversing   ====   "+reverVowel("Inetae5Ofjava"));
		  
	}
	
	public static String reverVowel(String str) {
		String vowel= "aieoueAIEOU";
		char [] car = str.toCharArray();
		int size1= car.length;
		for (int i=0;i<=size1/2;i++){
			if (vowel.contains(String.valueOf(car[i]))&&(vowel.contains(String.valueOf(car[size1-1-i])))){
				char temp = car[i];
				car[i]=car[size1-1-i];
				car[size1-1-i]= temp;
			}
			
		}
		return String.valueOf(car);
	}

}
