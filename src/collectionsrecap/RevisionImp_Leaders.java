package collectionsrecap;

import java.util.ArrayList;
import java.util.Arrays;

public class RevisionImp_Leaders {

	public static void main(String[] args) {
		findLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
		reverseString("I Am Not String");
		findSubArray(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
		findContiSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

	}
	
	private static void findContiSubArray(int[] arr, int num) {
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
			for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
				al.add(arr[i]);
				System.out.println("The sum is "+sum);
				if(sum>num){
					sum=arr[i];
				   al.clear();
				   al.add(arr[i]);
				}
				if(sum==num){
					System.out.println("The subarray is = "+al);
					break;
				}
			}
		  /* Alternate solution
		    while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'
 
                sum = sum - inputArray[start];
 
                //Incrementing start by 1
 
                start++;
            }
		   */
	}

	private static void findSubArray(int[] arr, int num) {
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<=j){
			if(arr[i]+arr[j]==num){
				System.out.println("The combination is "+arr[i]+" plus "+arr[j]+" = "+ num);
				i++;
				j--;
			}
			else if(arr[i]+arr[j]>num){
				j--;
			}
			else{
				i++;
			}
		}
		
	}

	private static String reverseString(String str) {
		char [] arr = str.toCharArray();
        char [] res= new char[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]==' '){
				res[i]=arr[i];
			}
		}
		System.out.println(res);
		try {
			int j=arr.length-1;
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=' '){
				    if(res[j]==' '){
				    	j--;
				    }
					res[j]=arr[i];
					j--;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
		return res.toString();
		
	}

	private static void moveZerosToEnd(int[] is) {
		// TODO Auto-generated method stub
		
	}

	static void  findLeaders(int [] arr){
		boolean status=true;
		for(int i=0;i<arr.length;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]<arr[j]){
				   status=false;
				   break;
			   }
			   status=true;
			   
		   }
		   if(status){
			   System.out.println(" The leaders are : "+arr[i]);
			   }
		}
		
	}

}
