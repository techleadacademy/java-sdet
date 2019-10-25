package day22.abstract_;

public class Aimpl extends A {
	
	public void m() {
		System.out.println("A");
	}

	public void print() {
		System.out.println("PRINT DET");
	}
	
	public static void main(String[] args) {
		Aimpl obj = new Aimpl();
	}
	
}
