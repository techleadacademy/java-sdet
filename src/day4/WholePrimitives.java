package day4;

public class WholePrimitives {
     public static void main(String args[]) {
    	 
    	 // byte: -128 to 127 
    	 byte num1 = 5;
    	 byte num2 = 6;
    	 
    	 //         (byte) byte + byte = int 
    	 byte sum = (byte)(num1 + num2);
    	 
    	 // too big for byte its range is -128 to 127
    	 //byte num3 = 129;
    	 
    	 
    	 
    	 //short: -32768 to 32767
    	 short num4 = 12354;
    	 short num5 = 543;
    	 
    	 int result = num4 + num5;
    	 
    	 System.out.println(num4 + num5);
    	 
    	 System.out.println("Short: "+ result);
    	 
    	 
    	 // int: -2147483648 to 2147483647
    	 int num6 = 100;
    	 int num7 = 30;
    	 int sum1 = num6 * num7;
    	 System.out.println(sum1);
    	 
    	 
    	 
    	 
     }
}
