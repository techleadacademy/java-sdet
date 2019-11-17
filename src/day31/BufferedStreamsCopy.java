package day31;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamsCopy {
	public static void main(String[] args) {
		File file = new File("/Users/techleadacademy/Desktop/names.txt");
		File file1 = new File("/Users/techleadacademy/Desktop/names_copy.txt");
		
		try(InputStream input = new BufferedInputStream(new FileInputStream(file));
				OutputStream output = new BufferedOutputStream(new FileOutputStream(file1))){
			
			byte[] buffer = new byte[1024];
			
			int bytes;
			while( ( bytes = input.read(buffer) ) > 0 ) {
				output.write(buffer,0,bytes);
			}
			
			System.out.println("DONE");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
				
	}
}
