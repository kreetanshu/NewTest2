package collectionsrecap;

public class TestSplit {

	public static void main(String[] args) {
		String s="bbaaccaa";
		String arr1[]= s.split("aa", -1);
		String arr2[]= s.split("aa", 0);
		double d = 1.0d;
		float fv= 1.2f;
		
		
		for(String el:arr1){
			System.out.print(el+",");
		}
		System.out.println();
		for(String el:arr2){
			System.out.print(el+",");
		}
	}

}
