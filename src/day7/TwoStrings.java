package day7;

import java.util.Scanner;

public class TwoStrings {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter two words:");
	  String word1 = sc.next();
	  String word2 = sc.next();
	  
	  if(word1.equalsIgnoreCase(word2)) {
		  System.out.println(word1 +" and "+word2 +" are equal");
	  }else {
		  System.out.println(word1 +" and "+word2 +" are not equal");
	  }
   }
}
