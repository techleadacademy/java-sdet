package day18;

import java.util.Arrays;

public class Searching {
   public static void main(String[] args) {
	   //          0,1,2,3  ,4 ,5,6
	  System.out.println("Linear Search:");
	  int[] arr = {1,3,5,73,234,6,0};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("Searching for 73");
	  System.out.println(getIndexOf(73,arr));
	  System.out.println("-----------------");
	  
	  System.out.println("Binary Search");
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	  System.out.println("Searching for 73");
	  System.out.println(Arrays.binarySearch(arr,73));
	  System.out.println("-----------------");
   }
   
   public static int getIndexOf(int number, int[] arr) {
	   int index = -1;
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] == number) {
			   index = i;
		   }
	   }
	   return index;
   }
}
