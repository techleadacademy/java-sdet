package day21;

public class Employee {
	private String firstname;
	private String lastname;
	private int age;
	private long employeeId;
	private String department;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 16) {
			System.out.println("You are too young to work here..");
			System.exit(0);
		}else {
			this.age = age;
		}
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", employeeId="
				+ employeeId + ", department=" + department + "]";
	}
}
