package day7;

public class IfElse {
   public static void main(String[] args) {
	  
	   // false
	   if(2 < 1) {   
		   System.out.println("Hello World!");
		   System.out.println("Great");
	   }
	   
	   boolean n = 10 > 100;
	   if(n) {
		   System.out.println("it was true and Im here");
	   }
	   
	   String w1 = "apple";
	   String w2 = "apple";
	   
	   if( w1.equals(w2) ) {
		   
		   System.out.println("They are equal");
		   
	   }else {
		   
		   System.out.println("They are not equal");
		   System.out.println(w1 +" : "+w2);
		   
	   }
	   
	  
   }
}
