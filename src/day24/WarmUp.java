package day24;

public class WarmUp {
	public static void main(String[] args) {
		m1("Hello!");
		
		String[] arr = {"a","b","c"};
		WarmUp obj = new WarmUp();
		System.out.println(obj.m2(arr));
		

	}
	
	public static void m1(String str) {
		System.out.println(str);
	}
	
	
	public String m2(String[] args) {
		
	 	return args[args.length - 1];
	 	
	}
	
}
