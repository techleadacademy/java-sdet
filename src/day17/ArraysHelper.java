package day17;

import java.util.Arrays;

public class ArraysHelper {
	public static void main(String[] args) {
		int[] arr = {4,1,2,3};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	
		String[] colors = {"white", "black","yellow"};
		
		Arrays.sort(colors);
		
		System.out.println(colors);
		System.out.println(Arrays.toString(colors));
			
	}
}
