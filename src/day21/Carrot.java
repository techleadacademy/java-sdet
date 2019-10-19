package day21;

public class Carrot extends Bird {
	
	public static void main(String[] args) {
		Carrot tommy = new Carrot();
		tommy.setName("Tommy");
		tommy.setAge(13);
		//tommy.fly();
		//tommy.talk();	
		
		//tommy.m();
		
		System.out.println(tommy);
	}
	
	public void talk() {
		System.out.println("Carrot - "+getName()+" is talking");
	}
	
	public void fly() {
		System.out.println("Carrot - "+getName()+" is flying");
	}
	
	public void m() {
		super.fly();
		//this.fly();
	}

	@Override
	public String toString() {
		return "Carrot "+getName()+" : "+getAge();
	}
	
	
	
}
