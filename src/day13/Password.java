package day13;

import java.util.Scanner;

public class Password {
    public static final String PASSWORD = "qwerty1$";
    
    public static void main(String[] args) {
    	access();
	}
    
    public static void access() {
    	Scanner sc = new Scanner(System.in);
    	String providedPassword = "";
    	boolean flag = true;
    	int limit = 3;
    	
    	do {
    		
    		System.out.println("Enter your password:");
    		providedPassword = sc.next();
    		limit--;
    		
    		flag = !PASSWORD.equals(providedPassword);
    		
   			if(!(limit > 0)) {
				System.out.println("Limit is over");
				flag = false;
			}
    		
    		if(!PASSWORD.equals(providedPassword)) {
    			System.out.println("Access Denied!");
    		}
    		
    	}while(flag);
    
    }
}
