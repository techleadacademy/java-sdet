package day28;

public class OrderOfInitialization {

	public static int i = 8;
	public int j = 9;
	
	static {
		
		System.out.println("Inside static block: " + i);
		i = 9;
		//j = 12; does not copmile
	}
	
	{
		System.out.println("initializer block " + i);
		System.out.println("initializer block " + j);
		i = 15;
		j = 12;
	}
	
	
	public OrderOfInitialization() {
		System.out.println("Constructor " + i);
		System.out.println("Constructor " + j);
		i = 11;
		j = 16;
	}
	
	public static void main(String[] args) {
		//System.out.println("Main: "+OrderOfInitialization.i);
		//System.out.println("Main: "+OrderOfInitialization.i);
		OrderOfInitialization obj = new OrderOfInitialization();
		System.out.println("Main "+obj.i);
	}
	
	
	
}
