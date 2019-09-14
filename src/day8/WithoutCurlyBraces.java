package day8;

public class WithoutCurlyBraces {
	public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        
        
        //  when there is no {} curly braces first statement will executed 
        if(number2 > number1)
        	System.out.println("Line 9");
        else 
        	System.out.println("Line 11");
            System.out.println("Line 12");
        
            
        if(number2 > number1) {
        	System.out.println("Line 18");
        }else{
        	System.out.println("Line 20");
        	System.out.println("Line 21");
        }
	}
}
