package day25;

public class Assignment5 {
	public static void main(String[] args) {
		String url = "https://docs.oracle.com/javase/abc/tutorial/essential/regex/pre_char_classes.html";
		
		//1. Split by / 
		//2. Get last one
		String[] words = url.split("/");
		System.out.println(words[words.length - 1]);
	}
}
