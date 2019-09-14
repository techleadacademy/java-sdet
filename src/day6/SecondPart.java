package day6;
import java.util.Scanner;

public class SecondPart {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word with even length");
		
		String str = sc.nextLine();
		
		System.out.println(str.substring(str.length()/2));
		
	}
   /**
    *  Ask from user string with even length
    *  split word in the middle and print second part
    *  0123
    *  Hell     -> ll
    *  012345
    *  123456   -> 456
    *  qwertyui -> tyui
    *  zxcv     -> cv
    *  
    */
}
