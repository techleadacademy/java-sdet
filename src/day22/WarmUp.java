package day22;

public class WarmUp {
	public static void main(String[] args) {
		printNums();
		printNums(1000);
	}
	
	public static void printNums() {
		for(int i = 100; i >= 1; i--) {
			System.out.print(i+" ");
		}			
	}
	
	public static void printNums(int num) {
		for(int i = num; i >= 1; i--) {
			System.out.print(i+" ");
		}			
	}
	
	public static void printNums(long num) {
		for(int i = (int)num; i >= 1; i--) {
			System.out.print(i+" ");
		}			
	}
	
}
