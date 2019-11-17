package day31;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("/Users/techleadacademy/Desktop/names.txt");
		StringBuilder content = new StringBuilder();
		
		try(InputStream in = new FileInputStream(file)){
			int b;
			
			while( (b = in.read()) != -1 ) {
				content.append((char)b);
			}
			
			System.out.println(content);
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
