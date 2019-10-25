package day23;

public class WarmUp {
	public static void main(String[] args) {
		char[] abc = {'a','b','c'};
		int[] nums = {1,2,3};
		
		System.out.println(abc);
		System.out.println(nums);
		
		System.out.println(getStrFromArrChar(abc));
		
	}
	
	public static String getStrFromArrChar(char[] arr) {
		String str = "";
		for(char ch : arr) {
			str = str + ch;
		}
		return str;
	}
}
