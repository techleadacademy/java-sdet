package day21;

public class Tester extends Person{
	private String firstname;
	
	public void printDetails() {
		//System.out.println(super.firstname); 
		System.out.println(this.firstname);
	}
	
	public Tester() {
		//super("Visha","Pandala");
		System.out.println("here in child");
	}
	
	public static void main(String[] args) {
		Tester t = new Tester();
	}
	
	
}
