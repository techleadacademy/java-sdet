package day20;

public class Person {

	public void print10() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Doe");
		}
	}
	
	public void printName(String name, int amount) {
		for(int i = 0; i < amount; i++) {
			System.out.println(name);
		}
	}
	
	/*
	 * Create a method that takes String name
	 * method returns this name as upper case 
	 */
	
	//                                 "name"
	public String makeNameUpper(String name) {
		String str = name.toUpperCase();
		return str;
	}
	
	
	
	
}
