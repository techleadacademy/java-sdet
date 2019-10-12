package day17;

import java.util.Arrays;

public class PassByValue {
	public static void main(String[] args) {
		//       32423423
		String[] arrStr = {"a","b","c"};
		
		//       32423423
		String[] arrStr1 = arrStr;
		
		arrStr1[0] = "e";
		
		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStr1));
		
		
		int num = 10; 
		
		change(num); 
		
		System.out.println(num);
		
		int[] numArr = {1,2,3};	
		System.out.println(Arrays.toString(numArr));
		
		changeObj(numArr);
		System.out.println(Arrays.toString(numArr));
	}
	
	public static void change(int n) { 
		// making copy of n and then does something
		n = 5;
	}
	
	//Pass by Value
	public static void changeObj(int[] num) {
		num[0] = 100;
	}
}
