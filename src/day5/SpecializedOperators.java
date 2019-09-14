package day5;

public class SpecializedOperators {
    public static void main(String args[]) {
    	
    	int num1 = 6;
  //             6  + 5
    	num1 = num1 + 5; // 11
  //    num1 = num1 + 5;  	
    	num1 += 5;       
    	
    	System.out.println(num1);
        System.out.println("________________");
    	
    	int num2 = 100;
    	
    	num2 = num2 - 45; // 55
    	//num2 = 55 - 15 -> 40
    	num2 -= 15;
    	
    	System.out.println(num2);
    	System.out.println("________________");
    	
    	
    	int num3 = 5;
    	//num3 = num3 * 3;
    	num3 *= 3; 
    	System.out.println(num3);
    	
    	int num4 = 9;
    	//   =   9  * 2
    	//num4 = num4 * 2; 
    	num4 *= 2;
    	System.out.println(num4);
    	System.out.println("________________");
    	
    	
    	int num5 = 35;
    	//num5 = num5 / 5;
    	num5 /= 5;
    	System.out.println(num5);
    	
    	
    	double num6 = 10;
    	num6 /= 3;
    	System.out.println(num6);
    	
    	
    }
}
