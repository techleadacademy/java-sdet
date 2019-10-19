package day21;

public class MethodsOverloading {
	
	public static void main(String[] args) {
		printSums(3);
		printSums(3,4,5);
		printSums(2.5);
		
		
	

	}
	
	public static void printSums(double ifghfg, double g) {
		
	}
	
	public static double printSums(double i) {
		System.out.println(i);
		return 8.8;
	}
	
	public static void printSums(int i) {
		System.out.println("First");
		System.out.println(i);
	}
	
	public static void printSums(int i, int j) {
		System.out.println("Second");
		System.out.println(i + j);
	}
	
	public static void printSums(int i, int j, int k) {
		System.out.println("Third");
		System.out.println(i + j + k);
	}
	
}
