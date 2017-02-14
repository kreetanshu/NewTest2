package collectionsrecap;

public class ReverseWordInSentence {

	public static void main(String[] args) {
		String str = "This is an example";
		//imp is split function
		String [] arr= str.split("\\s");
		String newstr="";
		String secstr="";
		for(int i=0;i<arr.length;i++){
			
			
			char [] wst= arr[i].toCharArray();
		    char [] wst2 = new char[wst.length];
			
			for(int j=0;j<wst.length;j++){	
				wst2[j]= wst[wst.length-1-j];	
			}
			for(int k=0;k<wst2.length;k++){
				//Char to string conversion using value of function
				newstr=newstr+String.valueOf(wst2[k]);
			}
			secstr=secstr+newstr+" ";
			newstr="";
		}
		System.out.println(secstr);
	}

}
