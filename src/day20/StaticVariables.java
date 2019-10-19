package day20;

public class StaticVariables {
	public static String name;
	public int phone;
	
	public String toString() {
		return name +" : "+phone;
	}
	
	public static void main(String[] args) {
		StaticVariables.name = "Bob";
		
		StaticVariables obj1 = new StaticVariables();
		System.out.println(obj1);
		obj1.name = "Bob";
		obj1.phone = 1234;
		System.out.println(obj1);
		
		StaticVariables obj2 = new StaticVariables();
		System.out.println(obj2);
		
	}
}
