package day22.abstract_;

public class D extends C{
	@Override
	public void run() {
		System.out.println("D is running");
	}
	
	@Override
	public void swim() {
		System.out.println("D is wimming");
	}
	
	@Override
	public String getName() {
		return "D";
	}

}
