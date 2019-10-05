package day13;

import java.util.Scanner;

public class BarChar {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("score 1:");
         System.out.println("score 2:");
         System.out.println("score 3:");
         
         int score1 = sc.nextInt();
         int score2 = sc.nextInt();
         int score3 = sc.nextInt();
         
         for(int i = 0; i < score1; i++) {
        	 System.out.print("#");
         }
         
         System.out.println("\n");
         
         for(int i = 0; i < score2; i++) {
        	 System.out.print("#");
         }
         
         System.out.println("\n");
         
         for(int i = 0; i < score3; i++) {
        	 System.out.print("#");
         }
	}
}
