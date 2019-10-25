package day22;

public class Child extends Parent {
	
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Hello From Child");
	}
	
	@Override
	public String changeTheWord(String word) {
		return super.changeTheWord(word)+"!";
	}
	

	
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.sayHello();
		System.out.println(ch.changeTheWord("Hello"));
	}
}
