package day25;

import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		String[] letters = new String[3];
		letters[0] = "A";
		letters[1] = "B";
		letters[2] = "C";		
		System.out.println(Arrays.toString(letters));
		
		// put inside letters array new letter "D"
		String[] letters1 = new String[4];
		for(int i = 0; i < letters.length; i++) {
			letters1[i] = letters[i];
		}
		
		letters1[3] = "D";
		
		letters = letters1;
		System.out.println(Arrays.deepToString(letters));		
	}
}
