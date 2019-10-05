package day12;

public class FinalKeyword {
   public static final int superNumber = 100;
	
   public static void main(String[] args) {
	  final String myName = "Beknazar";
	  // Does not compile because you cannot modify final variable
	  //myName = "Shakhnazar";
	  
	  final int PI;
	  
	  PI = 3;
	 
	
   }
}
