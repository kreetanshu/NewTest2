package collectionsrecap;

import java.util.Stack;

public class ValidExpresion {
	public static final String STARTB = "(";
	public static final String ENDB= ")";
	
	public static void main(String[] args) {
	   String exp= "(())";
	   boolean valid= true;
	    String [] ar= exp.split("\\s");
	   Stack<String> st= new Stack<String>();
	   for (int i=0;i<ar.length;i++){
	   
	     if (ar[i].equalsIgnoreCase(STARTB)){
	    	 st.push(ar[i]);
	    	 }
	     else  {
	    	 if(!st.isEmpty()){
	    		 String p = st.pop();
	    		 if(!p.equals(STARTB))
	    		  valid=false;
	    	    }
	    	 else{
	    	  valid=false;
	    	  }
	    	 
	    	 }
	    	
	       
	     }
	   
		 valid=st.isEmpty();
	   
	   if(valid && (exp.contains(STARTB)||exp.contains(ENDB))){
		   System.out.println("The exp is valid "+ exp);
	   }
	   else{
		   System.out.println("The exp is  Invalid "+ exp);  
	   }
	}

}
