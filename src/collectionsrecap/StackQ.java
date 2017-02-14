package collectionsrecap;

import java.util.Stack;

public class StackQ {

	public static void main(String[] args) {
		String exp= "(((())))";
		boolean valid= true;
		char [] ar= exp.toCharArray();
       Stack<String> st = new Stack<String>();
       
        try {
			for(char el:ar){
				//String el=String.valueOf(el1);
				if(el=='('){
					st.push(String.valueOf(el));
				}
				else if(el==')'){
					if(!st.empty()){
					st.pop();}
					else{
						st.push(String.valueOf(el));
					}
					
				}
			}
			
			if(st.empty()&& exp.length()!=0){
				System.out.println("Valid Expression");
			}
			else{
				System.out.println("Invalid Expression");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
