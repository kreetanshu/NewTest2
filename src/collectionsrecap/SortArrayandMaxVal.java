package collectionsrecap;

public class SortArrayandMaxVal {

	public static void main(String[] args) {
      int [] arr = {1,2,3,4};
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
    	  if(max< arr[i])
    	  max = arr[i];
    	  //arr[arr.length-1-i]= temp;
      }
      System.out.println(max);
      
      //Code for sorting the array in ascending
      int [] a = {1,6,5,2,3,4};
      int n= a.length;
      int temp;
      
      for (int i = 0; i < n; i++) 
      {
          for (int j = i + 1; j < n; j++) 
          {
              if (a[i] > a[j]) 
              {
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
          }
      }
      for(int el:a){
    	  System.out.print(el);
      }
	}

}
