package day24;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DeclareExceptions {
	
	public static void main(String[] args) {
//		try {
//			
//			m("/Users/techleadacademy/Desktop/day22.pdf");
//			
//		}catch(IOException e) {
//			System.out.println("FILE NOT THERE");
//		}
		
	
		 //m1("/Users/techleadacademy/Desktop/day40.pdf");
		 
//		try {
//			
//			m("/Users/techleadacademy/Desktop/day40.pdf");
//			
//		}catch(IOException e) {
//			
//			System.out.println("FILE 40 not there");
//			System.out.println("TRY FILE 24");
//			m("/Users/techleadacademy/Desktop/day24.pdf");
//			
//		}
		
			
		try {
			m2();
		}catch (NullPointerException e) {
			System.out.println("null was there");
		}
		
			
	}
	
	public static void m(String path) throws IOException {
		File file = new File(path);
		FileReader fReader = new FileReader(file);
		System.out.println(file.getName());
	}
	
	public static void m1(String path) {
		try {
			File file = new File(path);
			FileReader fReader = new FileReader(file);
			System.out.println(file.getName());
		}catch(IOException e) {
			System.out.println("FILE IS NOT HERE (in the method)");
		}
	}
	
	public static void m2() {
		String str = null;
		str.length();
	}
	
}
