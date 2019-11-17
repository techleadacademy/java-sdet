package day30;

import java.io.File;

public class DeleteHelper {
	public static void main(String[] args) {
		deleteAll("/Users/techleadacademy/Desktop/java-sdet");
	}
	
	public static void deleteAll(String path) {
		File dir = new File(path);
		if(dir.delete()) {
			
		}else {
			File[] files = dir.listFiles();
			for(File file : files) {
				deleteAll(file.getAbsolutePath());
			}
			dir.delete();
		}
		System.out.println(dir.getAbsolutePath() +" : DELETED");
	}
}
