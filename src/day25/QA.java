package day25;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class QA {
	public static void main(String[] args) {
		//StringBuilder more effective than String
		
		//StringBuilder is mutable
		//String immutable - once created you cannot modify it
		
		String str = "hello";
		str = str + "abc";
		for(int i = 0; i < 5; i++) {
			str = str + i;
		}
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append("abc");
		
		for(int i = 0; i < 5; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		
		
		
			
	
		
		
		
		
		
	}
}
