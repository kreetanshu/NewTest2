package sortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	public Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return "ID :"+id+" Name: "+ name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class SortCustomObject {

	public static void main(String[] args) {
		// Custom object arraylist
		List<Person> al = new ArrayList<Person>();
		al.add(new Person(1,"Abc"));
		al.add(new Person(3,"bbc"));
		al.add(new Person(4,"cbc"));
		al.add(new Person(2,"dbc"));
		
		System.out.println("Sorting based on Id ");
		Collections.sort(al,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getId()>o2.getId()){
					return 1;
				}
				else if(o1.getId()<o2.getId()){
					return -1;
				}
				return 0;
			}
			
		});
		for(Person p: al){
			System.out.println(p);
		}
		
		System.out.println("Sorting based on Persons name in reverse order");
		
		Collections.sort(al,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return -o1.getName().compareTo(o2.getName());
			}
			
		});
		for(Person p: al){
			System.out.println(p);
		}

	}

}
