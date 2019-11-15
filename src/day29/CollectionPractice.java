package day29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionPractice {
	public static void main(String[] args) {
		String str = "apple";
		Set<Character> letters = new LinkedHashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			letters.add(str.charAt(i));
		}
		
		System.out.println(letters);
		// Convert back to String and print it
		String noDstr = "";
		for(Character ch : letters) {
			noDstr += ch;
		}
		
		System.out.println(str);
		System.out.println(noDstr);
	}
}
