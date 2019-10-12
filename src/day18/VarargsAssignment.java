package day18;

public class VarargsAssignment {
	public static void main(String[] args) {
		String apple = "apple";
		varargs(apple,"banana","kiwi","asdfa");
		
		String[] fruites = {"apple","kiwi"};
		arr(fruites);
		
		varargs(fruites);
	}
	
	//Create a method
	//that accepts String varargs
	//Method prints each element of varargs 
	public static void varargs(String ...strs) {
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	public static void arr(String[] strs) {
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	// LUNCH BREAK TILL 1 PM EST
}
