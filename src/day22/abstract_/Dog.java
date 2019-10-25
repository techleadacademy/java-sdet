package day22.abstract_;

public class Dog extends Animal{
	
	
	public String getName() {
		return "Dog";
	}
	
	public void printDetails() {
		System.out.println("Dog details");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.printDetails();
		dog.getName();
	}
	
}
