package day22;

public class Parent {
	public void sayHello() {
		System.out.println("Hello From Parent");
	
	}
	
	public String changeTheWord(String word) {
		return word.toUpperCase();
	}
	
	//we cannot override final methods
	public final void printOnlyForParent() {
		System.out.println("PARENT!");
	}
}
