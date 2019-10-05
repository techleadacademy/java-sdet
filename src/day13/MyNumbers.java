package day13;

import java.util.Scanner;

public class MyNumbers {
   public static final int FAVORITENUMBER = 7;
   public static final int lessNumber = 5;
   
   public static void main(String[] args) {
	   //favoriteNumber();
	   lessNum();
   }
   
   public static void favoriteNumber() {
	   int numberFromUser = 0;
	   Scanner sc = new Scanner(System.in);
	   boolean flag = true;
	   
	   do {
		   System.out.println("guess my favorite number?");
		   numberFromUser = sc.nextInt();
		   
		   flag = numberFromUser != FAVORITENUMBER;
		   if(flag) {
			   System.out.println("Wrong..");
		   }
	   }while(flag);

	   System.out.println("Correct! Yes, it is "+numberFromUser);
   }
   
   // Keep asking user any number
   // if number is less then lessNumber, stop asking and print "Awesome"
   // if number is greater or equal, keep asking any number
   
   public static void lessNum() {
	   int numberFromUser = 0;
	   Scanner sc = new Scanner(System.in);
   
	   do {
		   System.out.println("guess my favorite number?");
		   numberFromUser = sc.nextInt();
		   
		   if(numberFromUser > lessNumber) {
			   System.out.println("Wrong..");
		   }
		  
	   }while(numberFromUser > lessNumber);

	   System.out.println("Correct! Yes, it is "+numberFromUser);
   }
   
}
