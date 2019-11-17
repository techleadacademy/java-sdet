package day30;

import java.io.File;
import java.io.IOException;

public class FileAssignment1 {
	public static void main(String[] args) throws IOException{
		//.mkdir();
		//.createNewFile();
		File sdet = new File("/Users/techleadacademy/Desktop/sdet");
		sdet.mkdir();
		
		File src = new File(sdet.getAbsolutePath()+"/src");
		src.mkdir();
		
		File target = new File(sdet.getAbsolutePath()+"/target");
		target.mkdir();
		
		File pom = new File(sdet.getAbsolutePath()+"/pom.xml");
		pom.createNewFile();
		
		File hello = new File(src.getAbsolutePath()+"/hello.txt");
		hello.createNewFile();
		
		File oop = new File(src.getAbsolutePath()+"/oop.txt");
		oop.createNewFile();
		
		File test = new File(target.getAbsolutePath()+"/test.xlsx");
		test.createNewFile();
		
		System.out.println("File Structure is created!");
		
		
	}
}
