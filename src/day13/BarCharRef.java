package day13;

import java.util.Scanner;

public class BarCharRef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("score 1:");
		System.out.println("score 2:");
		System.out.println("score 3:");

		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();

		showBar(score1);

		System.out.println("\n");
		showBar(score2);

		System.out.println("\n");
		showBar(score3);
	}

	public static void showBar(int score) {
		for (int i = 0; i < score; i++) {
			if (i >= 100) {
				break;
			}
			System.out.print("#");
		}
	}
}
