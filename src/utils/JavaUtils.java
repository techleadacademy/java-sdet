package utils;

import java.util.Random;
import java.util.Scanner;

public class JavaUtils {

	public static String getInputFromConcole(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		String input = scanner.next();
		scanner.close();
		return input;
	}
	
	public static int getRandomNumber(int range) {
		Random random = new Random();
		return random.nextInt(range);
	}
	
	
}
