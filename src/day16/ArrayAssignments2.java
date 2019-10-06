package day16;

public class ArrayAssignments2 {
	public static void main(String[] args) {
		
		int[] number = new int[100];
		
		for(int i = 0; i < 100; i++) {
			//      =   + 1
			number[i] = i + 1;
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.println();
		System.out.println("=================");
		
		for(int i = 99; i >= 0; i--) {
			System.out.print(number[i]+" ");
		}
		
		System.out.println();
		System.out.println("=================");
		
		for(int i = 0; i < 100; i++) {
			if(number[i] % 2 == 0) {
				System.out.print(number[i]+" ");
			}
		}
		
		
	}
}
