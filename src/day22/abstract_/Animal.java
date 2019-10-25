package day22.abstract_;

public abstract class Animal {
	
	public int age;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public abstract String getName();
	
	public abstract void printDetails();
	
	
	
	public static void main(String[] args) {
		//You cannot create object directly from abstract class
		//Animal anima = new Animal();
	}
}
