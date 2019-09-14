package practice;

import java.util.Scanner;

public class ChangeMakingProgram {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter whole number from 1 to  99:");

		System.out.println("I will find a combinqtion of coins");

		System.out.println("that equals that amount of change:");

		int inputNum = sc.nextInt();

		int q;
		int d;
		int n;
		int p;

		int leftNum;

		q = inputNum / 25;
		leftNum = inputNum % 25;
		System.out.println(q + "quartes");

		d = leftNum / 10;
		leftNum = leftNum % 10;
		System.out.println(d + "dime");

		n = leftNum / 5;
		leftNum = inputNum % 5;
		System.out.println(n + "nickles");

		p = leftNum;

		System.out.println(p + "pennies");

	}

}
