package collectionsrecap;

public class MissingNumber {

	public static void main(String[] args) {
		int [] arr ={1,2,3,4,5,6,7,9,10};
		int actsum=0;
		int rsum=0;
		for(int i=1;i<11;i++){
			actsum= actsum+i;
		}
       for(int el:arr){
    	   rsum=rsum+el;
       }
       System.out.println(actsum-rsum);
	}

}
