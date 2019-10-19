package day21;

public class Bird extends Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.println("Bird - "+name+" is flying");
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}
	
	
}
