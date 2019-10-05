package day12;

public class WhileLoop5 {
	public static void main(String[] args) {
       /*
        * Sum for odd numbers using while loop
        */
		int number = 10;
		int counter = 0;
		int sum = 0;
		
		while(counter <= number) {
			if(counter % 2 == 1) {
				sum += counter;
			}
			
			counter++;
		}
		
		System.out.println("Sum of Odd number from "+number+" is "+sum);
		
	}
}
