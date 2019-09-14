package practice;

import java.util.Scanner;

public class GettingInput {
    public static void main(String args[]) 
    {
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.println("What's your name?");
    	
    	String name;
    	name = keyboard.nextLine();
    	
    	System.out.println("Nice to meet you "+name);
    	
    }
}
