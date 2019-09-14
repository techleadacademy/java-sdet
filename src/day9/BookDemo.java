package day9;

public class BookDemo {
	public static void main(String[] args) {
    // create two objects from Book class
	// assign any values for title and pages
	// print values
		Book book1 = new Book();
		book1.title = "Java";
		book1.pages = 900;
		book1.printBookDetails();
		
		Book book2 = new Book();
		book2.title = "OCA";
		book2.pages = 300;
		book2.printBookDetails();
		
	
	}
}
