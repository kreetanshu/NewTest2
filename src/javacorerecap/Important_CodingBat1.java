package javacorerecap;

public class Important_CodingBat1 {

	public static void main(String[] args) {
		
       System.out.println(addSecond("hello",3));
	}
	
	public static String addSecond(String str1, int n){
	String tempStr = str1.substring(str1.length()-n);
	StringBuilder sb = new StringBuilder();
	
	for(int i=1;i<=n;i++){
		sb.append(tempStr);
	}
	return sb.toString();
	}

}
