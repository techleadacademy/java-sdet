package day20;

import java.util.Arrays;

public class StaticDemo {
	public static void main(String[] args) {
		StaticMethods.print12();
		
		String[] strArr = new String[4];
		strArr[0] = "Ab";
		strArr[1] = "C";
		strArr[2] = null;
		strArr[3] = "R";
		
		System.out.println(Arrays.toString(strArr));
		String out = StaticMethods.getFirstAndLast(strArr);
		
		System.out.println( StaticMethods.getFirstAndLast(strArr) );
		
		//Break till 8:30
	}
}
