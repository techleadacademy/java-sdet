package day21;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setFirstname("John");
		emp1.setLastname("Doe");
		emp1.setAge(16);
		emp1.setDepartment("Single Family Ananytics");
		emp1.setEmployeeId(123);
		
		System.out.println(emp1);
	}
}
