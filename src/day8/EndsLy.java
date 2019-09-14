package day8;
import java.util.Scanner;

public class EndsLy {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// string.endsWith(str) -> true
//		if(str.endsWith("ly")) {
//			System.out.println("EndsLy");
//		}else {
//			System.out.println("None EndsLy");
//		}
		
		int len = str.length();
		String ly  = "ly";
		
		if(str.substring(len - 2).equals(ly)) {
			System.out.println("EndsLy");
		}else {
			System.out.println("None EndsLy");
		}
	}
}
