package day18;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] num = {6,3,2,100,0};		
		System.out.println(Arrays.toString(num));		
		sortArray(num);	
		System.out.println(Arrays.toString(num));
		
		
		int[] num1 = {100,234,23};
		System.out.println(Arrays.toString(num1));
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	}
	
	public static int[] sortArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int smallestIndex = getSmallestIndex(i,nums);
			swapElements(i,smallestIndex,nums);
		}
		return nums;
	}
	                                      
	public static int getSmallestIndex(int startIndex, int[] num) {
		int min = num[startIndex];
		int indexOfMin = startIndex;
		
		for(int i = startIndex+1; i < num.length; i++) {  	
			if(min > num[i]) {       
				min = num[i];
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}
	
	//  0  1  2  3  4
	// [1][2][3][4][5] -> arr
	
	// [1][4][3][2][5]
	// swapElements(1,3,arr) -> 
	
	public static void swapElements(int i, int j, int[] num) {
		int temp = num[i];//temp = [2]
		num[i] = num[j]; //  [2] = [4] -> num[1] => [4]
		num[j] = temp;  // [4] = temp(2) -> [2]
	}
}
