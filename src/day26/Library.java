package day26;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		// Create an ArrayList which can hold Book (our custom class) 
		// Put 3 Books into your list
		
		ArrayList<Book> javaBooks = new ArrayList<>();
		
		Book oca= new Book("OCA",300);
		Book cleanCode = new Book("Clean Code",450);
		
		javaBooks.add(oca);
		javaBooks.add(cleanCode);	
		javaBooks.add(new Book("OCP",500));
		
		System.out.println(javaBooks);
		
		
		Book[] books = new Book[10];
		books[0] = new Book("abc",34);
		  
	}
}
