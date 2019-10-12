package day17;

import java.util.Arrays;

public class PassByValue1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr1 = arr;		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		arr1[0] = 100;
		arr[1] = 200;
		
		System.out.println(Arrays.toString(arr));  // 100, 2, 3
		System.out.println(Arrays.toString(arr1)); // 100, 2, 3
		
		
	}
}
