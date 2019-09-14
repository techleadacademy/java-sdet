package day7;
import java.util.Scanner;

public class StringComp {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   /*
	    *  Java java -> true
	    *  Code Code -> true
	    *  code cup  -> false
	    */
	   System.out.println("Give me two strings and I will tell you if they are equal");
	   String str1 = sc.next();
	   String str2 = sc.next();
	   boolean isEqual = str1.equalsIgnoreCase(str2);
	   System.out.println(isEqual);
	   
   }
}
