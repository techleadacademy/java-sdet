package day4;

import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("How are you?");
    	String answer = sc.nextLine();
    	
    	System.out.println("Oh, "+answer+"");
    }
}
