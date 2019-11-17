package day30;

import java.io.File;

public class FilePractice3 {
	public static void main(String[] args) {
		File tmp = new File("/Users/techleadacademy/Desktop/tmp");
		if(tmp.isDirectory()) {
			File[] files = tmp.listFiles();
			System.out.println("Files: "+files.length);
			
			for(File file : files) {
				System.out.println(file.getName() + " is hidden: "+file.isHidden());
			}
			
		}else {
			System.out.println("Files: "+0);
		}
	}
}
