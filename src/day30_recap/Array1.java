package day30_recap;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		/*
		 * 	Create String array with values
		 * 	[apple][orange][kiwi][banana]
		 *   
		 *  -> print values using for each loop
		 *  -> print values in reverse order
		 *  -> Replace each value with Upper case version. ["apple"] -> ["APPLE"]
		 *  
		 *  print array -> Array.toString();
		 */
		String[] fruits = new String[4];
		fruits[0] = "apple";
		fruits[1] = "orange";
		fruits[2] = "kiwi";
		fruits[3] = "banana";
		
		for(String fruit : fruits) {			
			System.out.print(fruit+" ");
		}
		System.out.println();
		
		
		for(int i = fruits.length - 1; i >= 0; i--) {
			System.out.print(fruits[i]+" ");
		}
		System.out.println();
		
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = fruits[i].toUpperCase();
		}
		// BREAK till 2:02 PM EST
		System.out.println(Arrays.toString(fruits));
			
	}
}
