package day9;

public class MethodArguments {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public String withoutFirst(String str) {
		String str1 = str.substring(1);
		return str1;
	}
	
	public static void main(String[] args) {
		
	   MethodArguments obj1 = new MethodArguments();
	   int num1 = 5;
	   int num2 = 6;
	   int mySum = obj1.sum(num1,num2);
	   System.out.println(mySum);
	   
	   String word = obj1.withoutFirst("apple");
	   System.out.println(word);
	   
	   
	}
}
