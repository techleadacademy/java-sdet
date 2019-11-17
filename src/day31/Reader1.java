package day31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
	public static void main(String[] args) {
		File f = new File("/Users/techleadacademy/Desktop/names.txt");
		
		try(BufferedReader reader = new BufferedReader(new FileReader(f))){
			
			String line;
			while ( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
