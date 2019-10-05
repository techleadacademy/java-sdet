package day13;

public class StringAndLoops {
	public static void main(String[] args) {
		
		String reversedStr = reverseStr("Hello");
		System.out.println(reversedStr);
		

	}
	
	public static String reverseStr(String str) {
		int index = str.length() - 1;
		String output = "";
		       
		while(index >= 0) {
			//         olleH
			output = output + String.valueOf(str.charAt(index));
			index--;
		}
		
		return output;
	}
	// Break till 11:10
}
