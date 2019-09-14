package day4;

import java.util.Scanner;

public class Multiply {
   public static void main(String args[]) {
	  
	   int num1;
	   int num2;
	   int result;
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Enter first number: ");
	   num1 = input.nextInt();
	   
	   System.out.println("Enter second number: ");
	   num2 = input.nextInt();
	   
	   result = num1 * num2;
	   System.out.println("Result is "+ result);
	   
   }
}

