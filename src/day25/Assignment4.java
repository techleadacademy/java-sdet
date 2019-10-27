package day25;

import java.util.Arrays;
import java.util.Collections;

public class Assignment4 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8};
		int[] numsR = new int[nums.length];
		// 8 7 6 5 4 3 2 1
		int j = 0;
		for(int i = nums.length -1; i >= 0; i--) {
			numsR[j] = nums[i];
			j++;
			//System.out.print(nums[i]+" ");
		}
		System.out.println(Arrays.toString(numsR));
		
		System.out.println("________________________");
		
		String str = "Oracle Certified Associate Java";
		
		//Java Associate Certified Oracle
		// 1. Split by space
		// 2. Then reverse Array of String[]
		// 3. Store the array to String 
		// 4. Print the value
		
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		String revereOfWords = "";
		for(int i = words.length - 1; i >= 0; i--) {
			revereOfWords += words[i]+" ";
		}
		System.out.println(revereOfWords);
		
	}
}
