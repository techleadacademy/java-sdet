package day30;

import java.io.File;
import java.io.IOException;

public class FilePractice2 {
	public static void main(String[] args) throws IOException {
		File tmpDir = new File("/Users/techleadacademy/Desktop/sdet");
		if(!tmpDir.exists()) {
			tmpDir.mkdir();
		}
		
		
		File f1 = new File(tmpDir.getAbsolutePath()+"/oop.pdf");
		f1.createNewFile();
		
		File f2 = new File(tmpDir.getAbsolutePath()+"/slides.pdf");
		f2.createNewFile();
		
		File f3 = new File(tmpDir.getAbsolutePath()+"/cat.png");
		f3.createNewFile();
		
		File f4 = new File(tmpDir.getAbsolutePath()+"/test_cases.xlsx");
		f4.createNewFile();
		
		File f5 = new File(tmpDir.getAbsolutePath()+"/ccfa.txt");
		f5.createNewFile();
		// slides.pdf
		// cat.png
		// test_cases.xlsx
		// ccfa.txt
		
		// Break 10 min till 10:10 PM EST
	}
}
