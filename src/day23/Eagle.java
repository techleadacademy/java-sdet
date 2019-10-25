package day23;

public class Eagle extends Bird{
	
	public void fly() {
		System.out.println("Eagle is flying..");
	}
	
	public static void main(String[] args) {
		Bird bird = new Eagle();
		bird.fly();
	}
}
