package day20;

public class StaticMethods {
	/*
	 * Create static method that will print
	 * "Java is fun" 12 times
	 * 
	 * Invoke / Call this method in StaticDemo class
	 */
	public static void print12() {
		for(int i = 0; i < 12; i++) {
			System.out.println("Java is fun");
		}
	}
	
	
	/*
	 * Create a static method that accepts String array
	 * it will return first and last element together 
	 * separated by space 
	 * 
	 *  use this method in StaticDemo class
	 *  print return value
	 */
	//                                   ["Ab"]["C"][null]["R"]
	public static String getFirstAndLast(String[] strArr) {
		return strArr[0] +" "+strArr[strArr.length - 1];
	}
	
}
