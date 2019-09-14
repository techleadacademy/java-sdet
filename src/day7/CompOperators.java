package day7;

public class CompOperators {
   public static void main(String[] args) {
	  /**
	   *     == -> to compare primitive numbers
	   */
	   
	   int i = 8;
	   int j = 8;
	   
	   if(i == j) {
		   System.out.println("Both are same..");
	   }
	   
	   i = 9;
	   j = 10;
	   
	   if(i == j) {
		   System.out.println("Good..");
	   }else {
		   System.out.println("Bad..");
	   }
	   
	   /**
	    *   != - NOT equal operator 
	    */
	   //  true 9 is not equal to 10
	   if(i != j) { 
		   System.out.println("Not equal!");
	   }else {
		   System.out.println("Equal!");
	   }
			   
	   
	   
	   
	   
	   
   }
}
