package day24;

import java.io.IOException;

public class Assignment {
	
	public static void main(String[] args) {
		try {
			
			m();
			System.out.println("Afer the method!");
			
		} catch(Exception e) {			
			System.out.println("Exception is handled!");
		}
		 
	}
	
	public static void m() {
		//throw new IllegalArgumentException("Here your nice exception!");
		throw new NullPointerException("NULL is here");
		
		
	}
}
