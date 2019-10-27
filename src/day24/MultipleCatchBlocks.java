package day24;

import java.io.IOException;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
	
			m();
			m1();
			m2();
		}catch (NullPointerException e) {
			
			System.out.println("null pointer. Field  cannot be empty");
			
		}catch (RuntimeException e) {
			
			System.out.println("RuntimeEx. Rerun program");
			
		}catch (IOException a) {
			
			System.out.println("IOException. Make sure file is there");
		}
		
	}
	
	
	public static void m() {
		System.out.println("It might throw NullPointerException");
		//throw new NullPointerException();
	}
	
	public static void m1() {
		System.out.println("It might throw RuntimeException");
		throw new RuntimeException();
	}
	
	
	public static void m2() throws IOException {
		System.out.println("It might throw IOException");
		throw new IOException();
	}
	
}
