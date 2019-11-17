package day30_recap;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[] numbers = {54,32,123,1,2,43};
		System.out.println(Arrays.toString(numbers));
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		
		System.out.println("SUM: "+sum);
		System.out.println("AVER: "+sum/numbers.length);
		
	}
	/*
	 * Create an int array with values:
	 * [54][32][123][1][2][43]
	 * 
	 * -> print it's values in the same line
	 * -> print sum of all values
	 * -> print average value
	 */
	
	
	
	
}
