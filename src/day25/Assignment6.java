package day25;

public class Assignment6 {
	public static void main(String[] args) {
		long number = 5894673289L;
		// 5894673289 -> 59638
		System.out.println(everEach(number));
		// 12345 -> 135
		// 
		// 2222  -> 22
		
		// 9987642 -> 9862
		
		
		
	}
	
	
	//Create a method that will accept long as an argument
	//return long with skipped one number
	
	//1. Convert long to String -> String.toString(long) or concatenation
	//2. Create empty String
	//3. Iterate every other letter (+2) -> store the letter in the new string +
	//4. Convert string back to long and return it (Long.parseLong(str))
	
	public static long everEach(long number) {
		String str = String.valueOf(number);
		String str1 = "";
		for(int i = 0; i < str.length(); i += 2) {
			str1 += str.charAt(i);
		}
		
		return Long.parseLong(str1);
	}
	
	
	
	
	
	
	
	
	
	
}
