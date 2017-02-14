package collectionsrecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		char [] strarr= str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<strarr.length;i++){
			if(strarr[i]!= ' ' && strarr[i] != '\t'){
				sb.append(strarr[i]);
			}
		}
		System.out.println(sb);
		Integer [] a1= {1,2,4,5,6,7};
		Integer [] a2 = {2,5,7};
		
	   List<Integer> al1 = new ArrayList<Integer>(Arrays.asList(a1));
	   List<Integer> al2 = new ArrayList<Integer>(Arrays.asList(a2));
	   al1.retainAll(al2);
	   System.out.println(al1);
		
		
	}

}
