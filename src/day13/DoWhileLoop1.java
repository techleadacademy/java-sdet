package day13;

public class DoWhileLoop1 {
	public static void main(String[] args) {
		//printNumbers(6);
		printNumbersInRev(10);
	}
	
	public static void printNumbers(int num) {
		int index = 1;
		do {
			System.out.print(index+" ");
			index++;
		}while(index <= num);
	}
	
	public static void printNumbersInRev(int num) {
		do {
			System.out.print(num + " ");
			num--;
		}while(num >= 1);
	}
}
