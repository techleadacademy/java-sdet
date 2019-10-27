package day24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
	public static void main(String[] args) {
		try {
			m1();
		}catch(Exception e) {
			System.out.println("just some message");
		}
		
		
		
		//m3();
		// m4() ;
	}
	
	// It's not required to handle runtimeExceptions
	public static void m1() {
		//throw new Exception();
		throw new RuntimeException();
	}
	
	public static void m2() {
		// It's not required to handle runtimeExceptions
		throw new IllegalArgumentException();
	}
	
	
	//Checked exceptions - you must handle or declare checked exceptions
	public static void m3() {
		try {
			System.out.println("1");
			
			throw new IOException();
			
			//Not reachable code
			//System.out.println("2");
			
		} catch (IOException e) {
			
			System.out.println("IOException is handled");
			System.out.println("Some code is here...");
			
		}
	}
	
	
	public static void m4() throws IOException {	
		BufferedReader bf = null;
		try {
			
			File myTestFile = new File("/Users/techleadacademy/Desktop/testFile.txt");
			FileReader fileReader = new FileReader(myTestFile);
			bf = new BufferedReader(fileReader);			
			System.out.println(bf.readLine());
			String line;
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}	
			
		}catch(Exception e) {
			
			System.out.println("HERE in CATCH");
			
		} finally {
			bf.close();
		}

		
	}
	
	
}
