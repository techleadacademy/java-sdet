package day8;

public class TernaryOperator2 {
    public static void main(String[] args) {
		int n = 5;
		int n2 = 7;
		
		int sum = 0;
		
		//             +
		sum = true ? n + n2 : 0;
		System.out.println(sum);
		
		//                +
		sum = false ? 8 : 0;
		System.out.println(sum);
		
		
		String str = "file";		
		if(str.length() > 2) {
			str = str.toUpperCase();
			
		}else {
			str = str.toLowerCase();
		}
		System.out.println(str);
		
		
		String str1 = "TM";
		str1 = str1.length() > 2 ? str1.toUpperCase() : str1.toLowerCase();
		System.out.println(str1);
		
		
		
	}
}
