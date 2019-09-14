package day4;

import java.util.Scanner;

public class Division {
    public static void main(String args[]) {
 	   double num1;
 	   double num2;
 	   double result;
 	   
 	   Scanner input = new Scanner(System.in);
 	   
 	   System.out.println("Enter first number: ");
 	   num1 = input.nextInt();
 	   
 	   System.out.println("Enter second number: ");
 	   num2 = input.nextInt();
 	   
 	   result = num1 / num2;
 	   System.out.println("Result is "+ result);
    }
}
