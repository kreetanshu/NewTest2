package sortingcollections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		if(str1.length()>str2.length()){
			return 1;
		}
		else if(str1.length()<str2.length()){
			return -1;
		}
		return 0;
	}
	
}
class ReverseStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class SortComparator {

	public static void main(String[] args) {
		List<String> animal = new ArrayList<String>();
		animal.add("cat");
		animal.add("bear");
		animal.add("tiger");
		animal.add("mouse");
		
		Collections.sort(animal);
		System.out.println("Sorting Based on ascending alphabetical order  :");
		
		for(String ele: animal){
			System.out.print(ele + ", ");
		}
		
		//Sorting based on length of string
		
		Collections.sort(animal, new StringLengthComparator());
		System.out.println();
		System.out.println("Sorting Based on String length  :");
		for(String ele: animal){
			System.out.print(ele + ", ");
		}
		//Sorting on reverse order of string
		
		Collections.sort(animal, new ReverseStringComparator());
		System.out.println();
		System.out.println("Sorting based reverse aplhabetical order  :");
		for(String ele: animal){
	     System.out.print(ele + ", ");
	     }		
		
	}

}
