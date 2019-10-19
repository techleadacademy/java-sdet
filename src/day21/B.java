package day21;

public class B extends A{
	
	@Override
	public void printHello() {
		super.printHello();
		System.out.println("Hello from B class");
	}
	
	@Override
	public int getNum() {
		return 4;
	}
	
	
	public void printHelloWorld() {
		System.out.println("HEllo WORLD");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.printHello();
		
	}
}
