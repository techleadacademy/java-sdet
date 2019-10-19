package day20;

public class Worker {
	public static void main(String[] args) {
		Person obj = new Person();
		obj.print10();
		
		obj.printName("Bob",15);
		
		String str = obj.makeNameUpper("abc");
		
		System.out.println(str);
	}
}
