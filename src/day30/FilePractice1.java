package day30;

import java.io.File;
import java.io.IOException;

public class FilePractice1 {
	public static void main(String[] args) throws IOException{
		
		File f = new File("/Users/techleadacademy/Desktop/test.txt");
		if(f.exists()) {
			System.out.println("File is exist");
			System.out.println(f.getName());
			
		}else {
				f.createNewFile();
				System.out.println("File is created: "+f.getName());
		}
		
		//You can delete you file
		f.delete();
	}
}
