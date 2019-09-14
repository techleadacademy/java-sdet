package day7;
import java.util.Scanner;

public class MiddleTwo {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   String responce;
	   
	   System.out.println("Enter word with even length:");
	   responce = sc.next();

	   /*
	    *  from even length word get two middle letters
	    *     4/2 = 2 - 1
	    *           2 + 1
	    *      012345
	    *      
	    *  ex: code -> od  (1,3)
	    *  
	    *  break till 10:27
	    *  
	    */
	   	   
	   int len = responce.length();
	   int fIndex = len / 2 - 1;
	   int sIndex = len / 2 + 1;
	   System.out.println(responce.substring(fIndex,sIndex));
	   
   }
}
