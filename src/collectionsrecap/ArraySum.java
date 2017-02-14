package collectionsrecap;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the sum desired for");
		int ncount=n.nextInt();
		int [] num = {1,0,2,3};
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				if((num[i]+num[j])==ncount){
					System.out.println("("+num[i]+","+num[j]+")");
					break;
				}
			}
		}

	}

}
