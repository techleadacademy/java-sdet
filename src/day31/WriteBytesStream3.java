package day31;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesStream3 {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/techleadacademy/Desktop/notes-1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		try(OutputStream out = new FileOutputStream(file)){
			
			out.write(72);
			out.write(73);
			
			char ch = '!';
			out.write((int)ch);
			
			System.out.println("Done!");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
