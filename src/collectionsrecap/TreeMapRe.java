package collectionsrecap;

import java.util.TreeMap;

public class TreeMapRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
	      
	      // Put elements to the map
	      tm.put("Zara", new Double(3434.34));
	      tm.put("Mahnaz", new Double(123.22));
	      tm.put("Ayan", new Double(1378.00));
	      tm.put("Daisy", new Double(99.22));
	      tm.put("Qadir", new Double(-19.08));
	      
	      System.out.println("the vlaues in map"+ tm);
	      for(Object key:tm.keySet()){
	    	  System.out.println("the values are ="+tm.get(key));
	      }
	      
	      System.out.println("First key method"+ tm.firstKey());
	      System.out.println("Last key method"+ tm.lastKey());
	      System.out.println("Head map method"+ tm.headMap("Mahnaz"));
	      System.out.println("Tail map method"+ tm.tailMap("Mahnaz"));
	      System.out.println("Sub map method"+ tm.subMap("Daisy", "Qadir"));
	}

}
