package day26;

import java.util.ArrayList;

public class Employee {
	
	
	@Override
	public String toString() {
		return "Employee []";
	}

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmpl = new ArrayList<>();
		listOfEmpl.add(new Employee());
		listOfEmpl.add(new Employee());
		listOfEmpl.add(new Employee());
		listOfEmpl.add(new Employee());
		
		System.out.println(listOfEmpl);
	}
}
