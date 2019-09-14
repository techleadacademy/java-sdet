package day6;
import java.util.Scanner;

public class WithoutLastChar {
    public static void main(String args[]) {
    	/**
    	 * 
    	 * Ask string from a user
    	 * Print without last character
    	 * 
    	 */
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string:");

    	String str = sc.nextLine();
    	int a = str.length();
    	
    	System.out.println(str.substring(0,a-2));
    	
    }
}
