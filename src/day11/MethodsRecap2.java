package day11;

import utils.JavaUtils;

public class MethodsRecap2 {
	public static void main(String[] args) {
		
//		int num = numManipulation(7);
//		System.out.println(num);
//		
//		String output = strMun("TechLeadAcademy");
//		System.out.println(output);
		
//	   int len  =	countLen();
//		System.out.println(len);
		
//		String word = toUpperFromUser();
//		System.out.println(word);
		
		System.out.println(JavaUtils.getRandomNumber(11));
		
		JavaUtils ju = new JavaUtils();
		ju.getRandomNumber(11);
	}
	
	// Create a method
	// which accepts 1 int agrument number and return int 
	//  if number within 5 - 8 range (inclusive) -> return number * 2
	//  if number within 12 - 20 (inclusive) return -> number * 3
	//  else return number itself
	
	public static int numManipulation(int number) {
		// 5 - 8 (inclusive)
		if(number >= 5 && number <= 8) {
			return number * 2;
		}else if(number >= 12 && number <= 20) { 
			return number * 3;
		}else {
			return number;
		}
	}
	
	
	// Create a method that returns String
	// it accepts one string  - str
	//   if str length > 5 -> return first 3 letters
	//   if str length > 10 -> return first 5 letters
	//   else return str 
	
	public static String strMun(String input) {
		int len = input.length();
		if(len > 5 && len < 10) {
			return input.substring(0,3);
		}else if(len > 10) {
			return input.substring(0,5);
		}else {
			return input;
		}
	}
	
	
	public static int countLen() {
	  String input = JavaUtils.getInputFromConcole("Enter your string, I will count length: ");
	  return input.length();
	}
	
	public static String toUpperFromUser() {
		  String input = JavaUtils.getInputFromConcole("Enter your string, I will do upper case: ");
		  return input.toUpperCase();
	}
	
	
	
	
	
}
