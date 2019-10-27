package day24;

public class ColdDown {
	
	// Create a method that will accept String as an argument 
	// Method will return char[] based on this method
	// Use in main method
	public static void main(String[] args) {
		char[] arr = strToChar("Java");		
		
		//[J][a][v][a]
		for(char ch : arr) {                
			System.out.println(ch);
		}
		
		int[] intArray = {1,2,3,4};
		System.out.println(intArray);
		for(int num : intArray) {
			System.out.print(num+" ");
		}
		
	}
	
	public static char[] strToChar(String str) {
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
		return chArr;
	}
	
}
