package day7;

public class StringContains {
   public static void main(String args[]) {
	   String str = "python, js, php, typeScript, java, R";
	   
	   boolean b = str.contains("java");
	  
	   System.out.println(str);
	   System.out.println(b);
	   
	   boolean b1 = str.contains("hello"); // false
	   boolean b2 = str.contains("va");    // true
	   boolean b3 = str.contains("on");    // true
	   boolean b4 = str.contains(",");     // true
	   boolean b5 = str.contains("Js");    // false
	   
	   System.out.println("b1 - "+b1);
	   System.out.println("b2 - "+b2);
	   System.out.println("b3 - "+b3);
	   System.out.println("b4 - "+b4);
	   System.out.println("b5 - "+b5);
	   
	   str = str.toLowerCase();
	   String word = "Js";
	   System.out.println(str.contains(word.toLowerCase()));
	   
	   // lunch till 12:45 
	   
   }
}
