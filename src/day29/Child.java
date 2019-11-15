package day29;

public class Child extends Parent {
	
	@Override
	public void run() {
		System.out.println("Running in Child class");
	}
	
	public void read() {
		System.out.println("Reading");
	}
	
}
