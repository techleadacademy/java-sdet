package day31;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingBytesStreams2 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("/Users/techleadacademy/Desktop/names.txt");
		
		String content = "";
		InputStream in = null;
		
		try {
			in = new FileInputStream(file1);
			
			int b;
			
			while( (b = in.read()) != -1) {
				content += (char)b;
			}
			System.out.println(content);
			System.out.println("DONE!");
						
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			in.close();
		}
	}
}
