package day7;

public class StringToNum {
   public static void main(String args[]) {
	   String number = "109";
	   int num1 = 1;
	   int num2 = Integer.parseInt(number);
	   
	   int sum = num1 + num2;
	   System.out.println(sum);
	   
	   String number1 = "10.5";
	   double num3 = Double.parseDouble(number1);
	   double num4 = 2.0;
	   System.out.println(num3 + num4);
	   
	   String str = "23";
	   int num5 = 2;
	   System.out.println( str + num5); // 232
	   
	   int num6 = Integer.parseInt(str);
	   System.out.println( num6 + num5); // 25
	   
	   byte b;
	   String bStr = "7";
	   b = Byte.parseByte(bStr);
	   
	   long l;
	   String lStr = "98";
	   l = Long.parseLong(lStr);
	   
	   String fStr = "12.5f";
	   String fStr1 = "12.5";
	   float f = Float.parseFloat(fStr);
	   float f1 = Float.parseFloat(fStr1);
	   System.out.println(f);
	   System.out.println(f1);
	   System.out.println(f + f1);
	   
	   float f2 = 32.3f;
	   
	   
   }
}
