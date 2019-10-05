package day12;

public class WhileLoop4 {
	public static void main(String[] args) {
        int number = 10;
        int counter = 0;
        int sum = 0;
        
        while(counter <= number) {
        	
        	if(counter % 2 == 0) {
        		//System.out.print(counter+" ");
        		sum = sum + counter;
        	}
        
        	counter++;
        }
        
        System.out.println("Sum of even numbers from "+number+" is "+sum);
        
       
	}
}
