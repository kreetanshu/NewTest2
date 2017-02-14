package collectionsrecap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindWordCountInFile {

	public static void main(String[] args) {
		try {
			countWord(".//FindWords.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void countWord(String path) throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		String line= bf.readLine();
		
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		while(line!=null){
			String arr[]=line.toLowerCase().split("\\s");
		      for(String el:arr){
			    if(hm.containsKey(el)){
			    	hm.put(el,hm.get(el)+1);
			    }
			    else{
			    	hm.put(el,1);
			    }
			   
		        }
		
			line=bf.readLine();
		   }
		
		// Sorting algo for hashmap on values
		Comparator<Entry<String,Integer>> comp= new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				// TODO Auto-generated method stub
				return arg0.getValue().compareTo(arg1.getValue());
			}
			
		};
		List<Entry<String,Integer>> ls=new ArrayList<Entry<String,Integer>>(hm.entrySet());
		System.out.println(ls);
		Collections.sort(ls,comp);
		TreeMap<String,Integer> hm2= new TreeMap<String,Integer>();
		for(Entry<String,Integer> el:ls){
			hm2.put(el.getKey(), el.getValue());
		}
		System.out.println(hm2.lastKey());
		
		bf.close();
		fr.close();
	}

}
