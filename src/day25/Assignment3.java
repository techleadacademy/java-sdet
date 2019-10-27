package day25;

public class Assignment3 {
	public static void main(String[] args) {
		String text = "This page shares my best articles to read"
				+ " on topics like health, happiness, creativity, "
				+ "productivity and more. The central question that drives my work is,"
				+ " “How can we live better?” To answer that question, "
				+ "I like to write about science-based ways to solve practical problems.";
		
		//Write a program that will count number of words in the text
		String[] arrText = text.split(" ");
		System.out.println("Number of words in text is: "+ arrText.length);
				
		// How many sentences in the text?
		String[] sentences = text.split("\\.");
		System.out.println("Sentences: "+sentences.length);
		
		// Please use loop and counter to find out how many sentences in text
		
		int counter = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '.') {
				counter++;
			}
		}
		System.out.println("Sentences: "+counter);
		
		
		// How many "A" or "a"
		int counterForAa = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				counterForAa++;
			}
		}
		System.out.println("Aa: "+counterForAa);
		
		
		
		
		
		
	}
}
