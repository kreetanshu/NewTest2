package collectionsrecap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxLetterInString {

	public static void main(String[] args) {
		String ar = "Hello Worlo";
		char [] ch = ar.toCharArray();
		HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
		int count=0;
		for(int i=0;i<ch.length;i++){
			
			
			
		  char cur= ch[i];
		  
		  for(int j=0;j<ch.length;j++){
			  if (cur==ch[j]){
				  count++;
			  }
		  }
		  
		  if(count>1){
			  hm.put(String.valueOf(ch[i]), count);
		  }
		 count=0; 
		}
		int maxValueInMap=(Collections.max(hm.values()));
		
		for(Map.Entry m:hm.entrySet()){  
			if(m.getValue().equals(maxValueInMap)){
			   System.out.println("This is the letter repeated max "+m.getKey());  
			   break;
			  } 
		
	}
		System.out.println("The maximum value in map is ="+maxValueInMap);
}
}
