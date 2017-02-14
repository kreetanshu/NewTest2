package collectionsrecap;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexCollection {

	public static void main(String[] args) {
		String [] vechicles ={"car","bus","truck"};
		String [][] driver={{"Ram","Shyam","Rocky"},{"Handsome","Befikre","Dangal","Raees"},{"Ajay","SRK","Salmaan"}};
	    
		Map<String,Set<String>> personel = new HashMap<String,Set<String>>();
		//Addition of data into map
		for(int i=0;i<vechicles.length;i++){
			String vechi = vechicles[i];
			String [] driverlist = driver[i];
			
			Set<String> driverset= new LinkedHashSet<String>();
			for(String dr:driverlist){
				driverset.add(dr);
			}
			personel.put(vechi, driverset);
			
		}
		
		for(String key:personel.keySet()){
			
			System.out.println("Entry in map "+ key+" => "+ personel.get(key));
		}

	}

}
