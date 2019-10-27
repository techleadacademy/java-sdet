package day25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.SocketException;

public class QA1 {
	public static void main(String[] args) throws Exception{

			
			readFile();

		
		//some code that throws Exception
		
	}
	
	
	public static void readFile() throws FileNotFoundException, SocketException {
		
		FileReader fReader = new FileReader("/Users/techleadacademy/Desktop/day2.pdf");	
		
		throw new SocketException();
	}
}
