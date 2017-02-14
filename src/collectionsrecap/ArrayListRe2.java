package collectionsrecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListRe2 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("ZZ","AA","BB","CC"));
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		Iterator itr = al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.sort(al1,Collections.reverseOrder());
		for(String el: al1){
			System.out.println(el);
		}
	}

}
