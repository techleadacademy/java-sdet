package day7;
import java.util.Scanner;

public class FlipProgram {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.next();
    	int len = input.length();
    	
    	String firstPart = input.substring(0,len / 2);	
    	String secondPart = input.substring(len / 2);
    	String output = secondPart + firstPart;
    	
    	System.out.println(output);
    	
    	
    }
}
