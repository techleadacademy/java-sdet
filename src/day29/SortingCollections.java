package day29;

import java.util.Arrays;
import java.util.Random;

public class SortingCollections {
	public static void main(String[] args) {
		/**
		 * 	Sorting:
		 *  - Numbers sorts before letters (smallest to biggest)
		 *  - Uppercase letters sorts before lowercase letters (alphabetic order)
		 *  
		 *  for Arrays to sort we use Arrays helper class
		 *  for Collections(List,Set,LinkedList) to sort we use Collections helper class
		 */
		
		int[] nums = getRandomArrNums();
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
				
	}
	
	public static int[] getRandomArrNums() {
		Random r = new Random();
		int[] numbers = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			numbers[i] = r.nextInt(1000); 
		}
		
		return numbers;
	}
	
	
	
	

}
