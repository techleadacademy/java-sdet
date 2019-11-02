package day26;

import java.util.ArrayList;

public class ArrayListNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		// put in this arrayList numbers from 1 - 1000
		//numbers.add(1);
		//numbers.add(2);
		//..
		
		for(int value = 1; value <= 1000; value++) {
			numbers.add(value);
		}	
		System.out.println(numbers);
		
		// Find out sum of all number inside your arrayList
		// Another loop
		
		// Create a method that will take ArrayList<Integer> as argument
		// Method will return sum of the elements as long 
		
		long n1 = getSumFromArrayList(numbers);
		System.out.println(n1);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(10);
		numbers2.add(6);
		numbers2.add(5);
		numbers2.add(2);
		System.out.println(getSumFromArrayList(numbers2));
				
	}
	
	public static long getSumFromArrayList(ArrayList<Integer> nums) {
		long sum = 0;
//		for(Integer num : nums) {
//			sum += num;
//		}
		
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		return sum;
	}
}
