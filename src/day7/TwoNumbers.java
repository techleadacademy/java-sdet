package day7;
import java.util.Scanner;

public class TwoNumbers {
   public static void main(String[] args) {
	  Scanner a = new Scanner(System.in);
	  
	  System.out.println("Enter two numbers, i will check if they equal:");
	  int num1 = a.nextInt();
	  int num2 = a.nextInt();
	  
	  if(num1 == num2) {
		  System.out.println(num1 + " and "+num2+" are equal");
	  }else {
		  System.out.println(num1 + " and "+num2+" are not equal");
	  }
	  
	  // Break till 2:20 PM
   }
}
