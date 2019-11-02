package day26;

import java.util.ArrayList;

public class ArrayListCreation {
	public static void main(String[] args) {
		String[] namesStr = new String[5];
		namesStr[0] = "John";
		namesStr[1] = "Bob";
		namesStr[4] = "Vijay";
		//System.out.println(namesStr[4]);
		
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("John"); // 0
		namesList.add("Bob");  // 1
		namesList.add("Vijay");// 2
		namesList.add(3,"Ramesh"); // Insert element to specific index
		namesList.set(1, "Vikas"); // Replace element with specific index
		
		
		System.out.println(namesList);
		
		System.out.println(namesList.get(2));
		System.out.println(namesList.get(3));
		System.out.println(namesList.get(0));
		
		System.out.println(namesList.get(2) +", "+namesList.get(3)+", "+namesList.get(0));
	
		
		
	}
}
