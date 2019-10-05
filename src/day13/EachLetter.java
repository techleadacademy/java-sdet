package day13;

public class EachLetter {
	public static void main(String[] args) {
		//printLetter("Hello");
		//printLetterSpace("Hello");
		printReverseString("apple");
	}
	
	public static void printLetter(String str) {	
		int index = 0;
		int length = str.length();
		
		while(index < length) {
			System.out.println(str.charAt(index));
			index++;
		}
	}
	
	// print -> H	e	l	l	o   
	public static void printLetterSpace(String str) {
		int index = 0;
		int length = str.length();
		
		while(index < length) {
			System.out.print(str.charAt(index)+"\t");
			index++;
		}
	}
	
	//                                          apple
	public static void printReverseString(String word) {
		//      4            5 - 1 
        int lastIndex = word.length() - 1;
        //        0  >= 0
        while(lastIndex >= 0) {
        	//                       apple.charAt(0) -> a
        	System.out.println(word.charAt(lastIndex));
        	lastIndex--;
        }
	}
	
}
