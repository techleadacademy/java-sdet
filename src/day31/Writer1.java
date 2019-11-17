package day31;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {
	public static void main(String[] args) {
		
		File myFile = new File("src/day31/somefile.txt");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(myFile))){
			
			writer.write("Some meaningful content");
			writer.newLine();
			writer.write("Today is last Java day");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
