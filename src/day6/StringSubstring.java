package day6;

public class StringSubstring {
   public static void main(String args[]) {
	   //            0123456789
	   String str = "SoftSkills";
	   String str1 = str.substring(4);
	   System.out.println(str1);
	   
	   str = "workspace";
	   System.out.println(str.substring(4));
	   
	   //     0123456789
	   str = "HelloWorld";
	   System.out.println(str.substring(5,8));
	   
	   /* 
	    * HelloWorld  ->  loW
	    * SDLC        ->  DL
	    * Sublime     ->  bl
	    * Window      ->  ind
	    * OptimizePDF ->  mize
	    * Navigate    ->  gat
	    * Search      ->  earch
	    */
	   //     012345678
	   str = "Window";
	   System.out.println(str.substring(2,4));
   }
}
