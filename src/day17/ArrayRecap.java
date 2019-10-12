package day17;

import java.util.Arrays;

public class ArrayRecap {
	public static void main(String[] args) {
		//System.out.println(getSmallestElement(new int[]{3,5,4,1,2,0}));
		
		//System.out.println(getSmallestIndex(new int[]{3,5,4,1,2,0}));
		
		//           0 1 2 3 4 5
		int[] arr = {3,5,4,1,2,0};
		
		System.out.println(Arrays.toString(arr));
		
		swapElements(1,5,arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	//(0,2,[12,2,3,4]) -> [3,2,12,4]
	public static void swapElements(int i, int j, int[] num) {
		//    1      num[0]
		int temp = num[i];
	//	     3         
	//    num[0]   =  num[2]
		num[i] = num[j];
	 
		//num[2]   =  1
		num[j] = temp;
	}
	//Break till 8:10
	
	
	//  0  1  2  3  4  5
    // [3][5][4][1][2][0]
	public static int getSmallestIndex(int[] num) {
		int min = num[0];
		int indexOfMin = 0;
		
		for(int i = 0; i < num.length; i++) {  
		
			if(min > num[i]) {
				//        
				min = num[i];
				indexOfMin = i;
				System.out.println("value: "+min);
				System.out.println("index of min: "+indexOfMin);
			}
		}
		
		return indexOfMin;
	}
	
	                                         // 0  1  2  3  4  
	                                        // [3][5][4][1][2]
	public static int getSmallestElement(int[] num) {
		//   3
		int min = num[0];
		
		for(int i = 0; i < num.length; i++) {
			//  3  >   3  
			//           
			if(min > num[i]) {
				//0
				min = num[i];			
			}
			// ->
		}
		
		return min;
	}
	
	public static int getMaxElement(int[] num) {
		int max = 0;
		
		for(int i = 0; i < num.length; i++) {	
			//  3  <  6
			if(max < num[i]) {
			//   6   
				max = num[i];
			}
		}
		return max;
	}
	
	
	
}
