package day5;

import java.util.Scanner;

public class BigSum {
   public static void main(String args[]) {
	   Scanner input = new Scanner(System.in);
	  
	   double sum;
	   System.out.println("Enter 1 numbner:");
	   //1
	   sum = input.nextDouble();
	   
	   System.out.println("Enter 2 number:");
	   //6  =  1  + 5
	   sum = sum + input.nextDouble();
	   
	   System.out.println("Enter 3 number:");
	   sum += input.nextDouble();
	   
	   System.out.println("Enter 4 number:");
	   sum += input.nextDouble();
	   
	   System.out.println("Enter 5 number:");
	   sum += input.nextDouble();
	   
	   System.out.println("Sum is " + sum);
	   
   }
}
