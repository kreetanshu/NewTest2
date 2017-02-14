package collectionsrecap;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int [] myarr={2,4,4,5,2,6,7};
		try {
			int[] out= removeDup(myarr);
			for(int i:out){
				System.out.print(i+",");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static int [] removeDup(int [] input){
		Arrays.sort(input);
		int count=0;
		boolean [] issame = new boolean [input.length];
		issame[0]=true;
		for(int i=0;i<input.length;i++){
			
			
			for (int j=i+1;j<input.length;j++){
				if(input[i]==input[j]){
					issame[j]=false;	
					count++;
				}
				else{
					issame[j]=true;
				}
				
			}	
		}
		for(boolean b:issame){
			System.out.print(b+",");
			
		}
		System.out.println();
		int [] result = new int [input.length-count];
		int ik=0;
		for(int k=0; k<input.length;k++){
			
			if (issame[k]==true){		
				result[ik]=input[k];	
				ik++;
			}
			
		}
	return result;	
	}

}
