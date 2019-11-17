package day31;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	/**
	 * To get file content
	 * 
	 * @param path to File to read
	 * @return String as a content
	 */
	public static String getFileContent(String path) {
		File file = new File(path);
		StringBuilder content = new StringBuilder();

		try (InputStream input = new FileInputStream(file)) {
			int b;
			while ((b = input.read()) != -1) {
				content.append((char) b);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return content.toString();
	}

	/**
	 * To copy file - takes long time to do copy
	 * 
	 * @param resourcePath
	 * @param destinationPath
	 */
	public static void copy(String resourcePath, String destinationPath) {
		System.out.println("Start Copying..");
		File res = new File(resourcePath);
		File des = new File(destinationPath);

		try (InputStream in = new FileInputStream(res); OutputStream out = new FileOutputStream(des)) {

			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}

			System.out.println("Completed!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * 
	 */
	public static void copyAdv(String res, String des) {
		File file = new File(res);
		File file1 = new File(des);

		try (InputStream input = new BufferedInputStream(new FileInputStream(file));
				OutputStream output = new BufferedOutputStream(new FileOutputStream(file1))) {

			byte[] buffer = new byte[1024];

			int bytes;
			while ((bytes = input.read(buffer)) > 0) {
				output.write(buffer, 0, bytes);
			}

			System.out.println("DONE");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static List<String> getLines(String path) {
		File f = new File(path);
		List<String> content = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {

			String line;
			while ((line = reader.readLine()) != null) {
				content.add(line);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return content;
	}

	
	public static void writeLinesToFile(String path, List<String> content) {
		File file = new File(path);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			for(String str : content) {
				writer.write(str);
				writer.newLine();
				
				writer.flush();
			}
			
			System.out.println("Done!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		// String data =
		// FileUtils.getFileContent("/Users/techleadacademy/Desktop/notes.txt");
		// System.out.println(data);

		// FileUtils.copy("/Users/techleadacademy/Desktop/ImageProcessing.zip",
		// "/Users/techleadacademy/Desktop/ImageProcessing_copy.zip");
		// FileUtils.copyAdv("/Users/techleadacademy/Desktop/ImageProcessing.zip",
		// "/Users/techleadacademy/Desktop/ImageProcessing_aCopy.zip");

//		List<String> lines = FileUtils.getLines("/Users/techleadacademy/Desktop/names.txt");
//		System.out.println(lines.get(0));
//		System.out.println(lines.get(lines.size() - 1));
		
		List<String> names = new ArrayList<>();
		
		names.add("Ilya");
		names.add("Aslan");
		names.add("Ikbol");
		
		FileUtils.writeLinesToFile("src/day31/friends.txt", names);
		

	}

}
