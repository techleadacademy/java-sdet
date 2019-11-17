package day30;

import java.io.File;

public class FileCounter {
	private int count = 0;
	
	public int countFiles(String path) {
		File dir = new File(path);
		if(dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			for(File file : files) {
				if(file.isFile()) {
					count ++;
				}else {
					countFiles(file.getAbsolutePath());
				}
			}
		}
		return count;
	}
}
