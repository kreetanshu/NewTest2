package collectionsrecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {
		dupElement("abcabdefghi");
		System.out.println("\"Hello\"");
		dupElement1("abcabdefghi");
	}
	
   public static void dupElement1(String str){
	   String arr[] = str.split("");
	   List<String> al= new ArrayList<String>(Arrays.asList(arr));
	   Set<String> st= new HashSet<String>();
	   for(String el: arr){
		   st.add(el);
	   }
	   System.out.println(st);
	   System.out.println(al);
	   al.removeAll(st);
	   System.out.println(al);
   }
   public static void dupElement(String str){
	   String arr [] = str.split("");
	   HashMap<String,Integer> hm = new HashMap<String,Integer>();
	   for(int i=0;i<arr.length;i++){
		   if(hm.containsKey(arr[i])){
			   hm.put(arr[i], hm.get(arr[i])+1);
		   }
		   else{
			   hm.put(arr[i], 1);
		   }
	   }
	  
	   for(Map.Entry<String,Integer> el : hm.entrySet()){
		   if (el.getValue()>1){
			   System.out.println(el.getKey()+"=>"+el.getValue());
		   }
	   }
   }
}
