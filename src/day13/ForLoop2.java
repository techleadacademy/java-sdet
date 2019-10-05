package day13;

public class ForLoop2 {
    public static void main(String[] args) {
		
    	for(int i = 1; i <= 5; i++) {
    		System.out.print(i+" ");
    	}
    	
    	System.out.println("\n");
    	
    	for(int i = 5; i >= 1; i--) {
    		System.out.print(i+" ");
    	}
    	
    	System.out.println("\n");
    	// 100 -> sum of even numbers inside 100
    	
    	for(int i = 0; i <= 100; i++) {
    		if(i % 2 == 0) {
    			System.out.print(i+" ");
    		}
    	}
   
    	System.out.println("\n");
    	int sum = 0;
    	for(int i = 0; i <= 8; i++) {
    		if(i % 2 == 0) {
    			sum = sum + i;
    		}
    	}
    	System.out.println("Sum of even "+sum);
    	
	}
}
