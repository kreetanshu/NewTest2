package collectionsrecap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraListRe {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ln = new LinkedList<String>();
		ArraListRe.addtoList(al);
		ArraListRe.addtoList(ln);
	long timeadd = System.currentTimeMillis();
		ArraListRe.addtoList(al);
    long timeadd2 = System.currentTimeMillis();
        ArraListRe.addtoList(ln);
    long timeadd3 = System.currentTimeMillis(); 
    
    System.out.println("Time for adding in Arraylist ="+(timeadd2-timeadd));
    System.out.println("Time for adding in Linkedlist ="+(timeadd3-timeadd2));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ABC3");
		al2.add("ABC4");
		al2.add("ABC5");
		System.out.println("Contians method"+al2.contains("ABC5"));
		
		System.out.println("+++++++++++  "+al2.remove("ABC3"));
        
	
	}
	public static void addtoList(List<String> adl){
		if(adl.size()<999){
		for(int i=0;i<10000;i++){
			adl.add(i, "ABC");
		}}
		else{
			for(int i=0;i<10000;i++){
				adl.add(0, "ABC");
			}
			
		}
	}
	public static long timediff(List<String> al3){
		//al.set(1,"11111");
         long time = System.currentTimeMillis();
        for(String el: al3){
        	System.out.println("The elements are"+ el);
            //System.out.println(al2.get(al.indexOf(el)));
            
        } 
        long time2 = System.currentTimeMillis();
        return time2-time;
	}

}
