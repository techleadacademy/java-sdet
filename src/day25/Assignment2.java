package day25;

import java.util.Arrays;

public class Assignment2 {
	public static void main(String[] args) {
		String[] letters = new String[4];
		letters[0] = "A";
		letters[1] = "B";
		letters[2] = "C";
		letters[3] = "D";
		
		//[A, B, C, D]
		System.out.println(Arrays.toString(letters));
		
		String tmp;
		tmp = letters[1];
		letters[1] = letters[3];
		letters[3] = tmp;
		
		// Swap second element with last element
		// [A, D, C, B]
			
		System.out.println(Arrays.toString(letters));
	}
}
