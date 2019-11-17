package day30;

import java.io.File;

public class FileAssignment2 {
	public static void main(String[] args) {
		File tmp = new File("/Users/techleadacademy/Desktop/tmp");
		
		if(tmp.delete()) {
			System.out.println("Deleted!");
		}else {
			File[] files = tmp.listFiles();
			for(File file : files) {
				file.delete();
			}
			tmp.delete();
			System.out.println("Deleted");
		}
	}
	
	
}
