package sortingcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	private String name;
	 public Person2(String name){
		 this.name=name;
	 }
	 public String toString(){
		 return name;
	 }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person2 o) {
		// TODO Auto-generated method stub
		//return name.compareTo(o.name);
		if(name.length()>o.name.length()){
			return 1;
		}
		else if(name.length()<o.name.length()){
			return -1;
		}
		
		return name.compareTo(o.name);
	}
}

public class SortComparable {

	public static void main(String[] args) {
		List<Person2> ls = new ArrayList<Person2>();
		SortedSet<Person2> st= new TreeSet<Person2>();
		
		addElement(ls);
		addElement(st);
		
		showElements(ls);
		showElements(st);
		
	}
	
	public static void addElement(Collection<Person2> c){
		c.add(new Person2("RKM"));
		c.add(new Person2("RK2"));
		c.add(new Person2("ABC121"));
		c.add(new Person2("xyz"));
	}
	
	public static void showElements(Collection<Person2> c){
		System.out.println();
		for(Person2 p:c){
			System.out.print(p+",");
		}
	}

}
