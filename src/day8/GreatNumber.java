package day8;
import java.util.*;

public class GreatNumber {
    public static void main(String[] args) {
		/**
		 *   -> Generate Random number 0-100
		 *   -> Declare String variable  - str
		 *   -> if value of your random number > 50
		 *   -> Assign value for str = "Great Number"
		 *   -> if your random number < 50 -> str = "Regular One"
		 *   
		 *   USE TERNARY Operator!
		 *   String str = (condition) ? "Great Number" : "Regular One";
		 */
    	
    	Random r = new Random();
    	int number = r.nextInt(101);
    	
    	String str = number > 50 ? "Great Number" : "Regular One";
    	System.out.println(number);
    	System.out.println(str);
    
	}
}
