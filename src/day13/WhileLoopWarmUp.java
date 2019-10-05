package day13;

public class WhileLoopWarmUp {
	public static void main(String[] args) {
		//printNumbersInSeq(8);
		printNumbers(2,6);
	}
	
	/**
	 * create static void method
	 * it will accept one int parameter
	 * it will print numbers in sequence till that int parameter
	 * 
	 *   8 -> 1 2 3 4 5 6 7 8
	 *   3 -> 1 2 3
	 */                                        
	public static void printNumbersInSeq(int number) {
		int index = 1;
		while(index <= number) {
			System.out.print(index+" ");
			index++;
		}
	}
	
	// printNumber(2,4)   -> 2 3 4
	// printNumber(5,10)  -> 5 6 7 8 9 10
	// printNumber(10,12) -> 10 11 12
	//                                   2          6
	public static void printNumbers(int start, int end) {
		while(start <= end) {
			System.out.print(start+" ");
			start++;
		}
	}
	
	
	
}
