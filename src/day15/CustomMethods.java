package day15;

public class CustomMethods {
	public static void main(String[] args) {
		printWord("DNKN");
		System.out.println(reverseStr("ABC"));
		
	}
	
	// all method will be static
	public static void printWord(String word) {
		System.out.println(word+"!");
	}
	
	// Method should accept int as arg - num
	// Method should print "Hello, World" num time
	// printHello(2) -> "Hello, World"
    //	                "Hello, World"
	
	
	// Method will accept String arg
	// Method will return reverse version of argument
	// reverseStr("ABC") -> CBA
	
	//                                    01234
	//                                    hello
	public static String reverseStr(String str) {
		String strR = "";
		//      i = 5 - 1            -1 >= 0
		//               i = -1
		for(int i = str.length()- 1; i >= 0; i-- ) {
			//olleh 
			strR = strR + str.charAt(i);
		}
		return strR;
	}
	
	public static String reverseStb(String str) {
		StringBuilder sb = new StringBuilder(str);	
		return sb.reverse().toString();
	}
}
