package day24;

public class ExceptionPr {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.substring(0,10)); //StringIndexOutOfBoundsException
		
		
		
		String str1 = null;
		System.out.println(str1 != null);
		//str1.charAt(0); NullPointerException
		
		int i = 8;
		//System.out.println(i / 0); ArithmeticException
		
		String str2 = "23zxc";
		//int num = Integer.parseInt(str2); // NumberFormatException
		
		short[] arrShort = new short[3];
		arrShort[0] = 1;
		arrShort[1] = 2;
		arrShort[2] = 3;
	//	arrShort[3] = 4;  // ArrayIndexOutOfBoundsException:
		
		
		
		
		
		
	}
}
