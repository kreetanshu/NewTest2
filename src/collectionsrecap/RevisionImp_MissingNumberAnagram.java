package collectionsrecap;

import java.util.Arrays;

public class RevisionImp_MissingNumberAnagram {

	public static void main(String[] args) {
		int [] a = {1,2,4,5,7,6,9,8};
		
		System.out.println(missingNumber(a));
		System.out.println(isBinary(101100011));
		System.out.println(isBinary(100030001));
		System.out.println(isAnagram("peek", "keep"));
		System.out.println(isAnagram("Dormitory","Dirty Room"));
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);//important is alternate solution

	}
	
	public static int missingNumber(int [] arr){
		Arrays.sort(arr);
		int n = arr[arr.length-1];
		//sum of n numbers
		int sumofnumbers = n*(n+1)/2;
		int sumofarr=0;
		for (int a:arr){
			sumofarr=sumofarr+a;
		}
		return sumofnumbers-sumofarr;
	}
	
	public static boolean isBinary(int n){
		int bin;
		while(n>=1){
		bin=n%10;	
		if (bin>1){
			return false;
		}
		n=n/10;
		}
		return true;
	}
	
	static boolean isAnagram(String s1, String s2){
		String copyS1= s1.replaceAll("\\s","").toLowerCase();
		StringBuilder sb = new StringBuilder(s2.replaceAll("\\s","").toLowerCase());
		char [] charr = copyS1.toCharArray();
		for(char c:charr){
			if (sb.indexOf(String.valueOf(c))!=-1){
				//System.out.print(String.valueOf(c));
				sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
			}
		}
		//System.out.println(sb);
		return(sb.length()==0);
	}
	
	static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }

}
