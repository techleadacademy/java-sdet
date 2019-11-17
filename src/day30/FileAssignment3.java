package day30;

import java.io.File;

public class FileAssignment3 {
	public static void main(String[] args) {
		File dir = new File("/Users/techleadacademy/Desktop/sdet");
		
		File[] files = dir.listFiles();
		int count = 0;
		for(File file : files) {
			if(file.isFile() && !file.isHidden()) {
				count++;
			}
		}
		
		//System.out.println("Files: "+count);
		
		System.out.println("================");
		FileCounter fileCounter = new FileCounter();
		int fileAmount = fileCounter.countFiles("/Users/techleadacademy/Desktop");
		System.out.println("Files in tmp: "+fileAmount);
	}
	
	
}
