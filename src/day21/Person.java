package day21;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	
	
	

	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("Invalid Input for age");
			
		}else {
			this.age = age;
		}
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
}
