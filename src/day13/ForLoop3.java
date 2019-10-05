package day13;

public class ForLoop3 {
	public static void main(String[] args) {
       // print "Hello World" 5 times using for loop
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Hello World");
//			System.out.println(i);
//			if(i == 2) {
//				break;
//			}
//		}
		
		String str = "serwear$sadfasfasf";
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if(letter == '$') {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
	}
}
