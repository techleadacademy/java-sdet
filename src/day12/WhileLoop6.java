package day12;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {
		/*
		 *  4
		 *  
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Provide some number, I will do asteriks for you:");
    	int userNumber = sc.nextInt();
    	
    	int index = 0;
    	String str = "*";
    	
    	while(index < userNumber) {
    		System.out.println(str);
    		str += "*";
    		index++;
    	}
    	
    	
	}
}
