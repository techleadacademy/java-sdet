package day21;

public class PersonDemo {
	public static void main(String[] args) {
		Person john = new Person();
		john.setFirstname("John");
		john.setLastname("Doe");
		john.setAge(10);
		
		
		System.out.println(john.getFirstname());
		System.out.println(john.getLastname());
		System.out.println(john.getAge());
	}
}
