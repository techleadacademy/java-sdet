package day24;

import java.io.IOException;

public class DeclareExceptons1 {
	
	public static void main(String[] args) {
		try {
			m();
		}catch(Exception e) {
			System.out.println("IOExc is handled");
			
		}
		
		
	}
	
	public static void m() throws IOException{
		
		throw new IOException();
		
	}
	
}
