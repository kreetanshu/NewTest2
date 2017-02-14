package collectionsrecap;

public class ArraySumMiddleIndex {

	public static void main(String[] args) {

		int[] num = { 2, 4, 5, 1,5, 4, 1 };
		int suml=0; int sumr=0;
		int start=0;int end=num.length-1;
		for(int i=0;i<=(num.length)/2;i++){
			
			suml=suml+num[start++];
			sumr=sumr+num[end--];
			if(suml==sumr){
				System.out.println("The index is = "+i);
				break;
			}
			
		}
		

	}

}
