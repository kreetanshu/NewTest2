package collectionsrecap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapRe2 {

	public static void main(String[] args) {
		// creating tree map 
		   TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		      
		   // populating tree map
		   treemap.put(2, "two");
		   treemap.put(1, "one");
		   treemap.put(3, "three");
		   treemap.put(9, "sixteen");
		   treemap.put(5, "nnnnn0");
		      
		   // putting values in navigable map
		   NavigableMap nmap=treemap.descendingMap();
		      
		   System.out.println("Checking value");
		   System.out.println("Navigable map values: "+nmap);
		   
		   for(Map.Entry hm:treemap.entrySet()){
			   
			   System.out.print(hm.getKey() +" => ");
			   System.out.println(hm.getValue());
		   }

	}

}
