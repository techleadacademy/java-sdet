package day6;

import java.util.Scanner;

public class EvenOdd {
   public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a string");
	System.out.println("if its even length program will print 0 otherwise 1");
	
	String inputFromUser = sc.nextLine();
	
	// % 
	System.out.println(inputFromUser+": "+inputFromUser.length() % 2);

	
   }
}
