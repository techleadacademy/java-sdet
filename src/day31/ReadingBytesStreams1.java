package day31;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingBytesStreams1 {
	public static void main(String[] args) {
		File file = new File("/Users/techleadacademy/Desktop/notes.txt");
		
		try {
			InputStream in = new FileInputStream(file);
			
			int b = in.read();
			System.out.println((char)b);
			
			int b1 = in.read();
			System.out.println((char)b1);
			
			int b3 = in.read();
			System.out.println((char)b3);
			
			int b4 = in.read();
			System.out.println((char)b4);
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
