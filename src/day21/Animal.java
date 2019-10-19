package day21;

public class Animal {
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + "]";
	}
	
	
}
