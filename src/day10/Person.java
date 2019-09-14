package day10;

public class Person {
	public String firstname;
	public String lastname;
	public int age;
	
	public void learn() {
		System.out.println(firstname +" "+lastname +" is learning");
		
	}
	public void sleep() {
		System.out.println(firstname + " "+ lastname + " is sleeping");
	}
	
	public void eat() {
		System.out.println(firstname + " "+ lastname + " is eating");
	}
	
	public String getFullName() {
		return firstname +" "+lastname;
	}
	
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.firstname = "Bob";
		person1.lastname =  "Doe";
		person1.eat();
		person1.sleep();
	    String fullname = person1.getFullName();
	    System.out.println(fullname);
	    
	    
	    
	}

	
}
