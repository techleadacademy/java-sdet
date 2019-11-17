package day30;

import java.io.File;

public class FilePractice {
	public static void main(String[] args) {
		// Existing File  
		File myFile = new File("/Users/techleadacademy/Desktop/notes.txt");
		
		System.out.println("File exists: "+myFile.exists());
		System.out.println("File Name: "+myFile.getName());
		System.out.println("Path: "+myFile.getAbsolutePath());
		
		System.out.println("IS FILE: "+myFile.isFile());
		System.out.println("IS DIRECTORY: "+myFile.isDirectory());
		
		//Check size - length() will return number of bytes in the file
		System.out.println(myFile.length());
		
		// Last modification date - epoch(we can convert to regular dates)
		System.out.println("Last Modified: "+myFile.lastModified());
		
		
		File dir = new File("/Users/techleadacademy/Desktop");
		System.out.println(dir.getName()+" is directory:"+dir.isDirectory());
		
		
	}
}
