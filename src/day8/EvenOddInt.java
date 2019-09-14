package day8;

import java.util.Random;

public class EvenOddInt {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(101);

		/*
		 * TODO your code goes here 
		 * if number is even print <number> is even 
		 * if number is odd print <number> is odd
		 * 
		 * use % operator
		 */
		
		if(number % 2 == 0) {
			System.out.println(number + " is even");
		}else{
			System.out.println(number + " is odd");
		}
		
		

	}
}
