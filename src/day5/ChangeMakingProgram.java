package day5;

import java.util.Scanner;

public class ChangeMakingProgram {
    /**
     *    ChangeMakingProgram

           Requirement:
           - Write a program that accepts from a User number
             from 1 to 99
           - The program responds by telling the user one
             combination of coins that equals that amount
             of change

           ex:
           Enter a whole number from 1 to 99.
           I will find a combination of coins
           that equals that amount of change
           87
           87 cents in coins:
           3 quarters
           1 dime
           0 nickels
           2 pennies
           
           52
           2 q
           0 dime
           0 nickels
           2 pennies
        */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins");
		System.out.println("that equals that amount of change");
		
		int inputNum = sc.nextInt();
		
		int q;
		int d;
		int n;
		int p;
		
		int leftNums;
		
		q = inputNum / 25;
		leftNums = inputNum % 25;
		
		d = leftNums / 10;
		leftNums = leftNums % 10;
		
		System.out.println(q);
		// 87 / 25 =
		// 87 % 25 = 
		
	}
}












