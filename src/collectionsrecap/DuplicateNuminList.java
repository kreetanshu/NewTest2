package collectionsrecap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNuminList {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(2);
		numList.add(3);
		numList.add(3);
		numList.add(3);
		numList.add(3);
		numList.add(4);
		
		Map<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i< numList.size();i++){
			int curr= numList.get(i);
			int count=0;
			for(int j=0;j< numList.size();j++){
				if(curr==numList.get(j)){
					count+=1;
					
				}
			}
			if(count>1){
				hm.put(numList.get(i), count);
			}
			
		}
		//Duplicate number
		System.out.println(hm);	
		int max=0;
		//Greatest duplicate
		for(Map.Entry<Integer, Integer> m1:hm.entrySet()){
			
			if(m1.getValue()>max){
				max=m1.getKey();
			}
		}
		System.out.println("The maximum value is = "+max);
	}

}
