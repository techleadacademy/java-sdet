package day15;

public class WrapperClasses {
  public static void main(String[] args) {
	// String to primitives  
	String numStr = "1243";
	long num = Long.parseLong(numStr);
	short shortNum = Short.parseShort(numStr);
	int i = Integer.parseInt("1232342");
	System.out.println(i);
	
	
	// Primitives tp String
	int number = 999;
	String numStr1 = Integer.toString(number);
	String numStr2 = String.valueOf(number);
	
	byte b = 45;
	String bStr = Byte.toString(b);
	String bStr1 = String.valueOf(b);
	
	// dont use this way
	String bStr2 = b + "";
	
	
	
	
	
	
}
}
