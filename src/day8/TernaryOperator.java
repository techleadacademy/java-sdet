package day8;

public class TernaryOperator {
    public static void main(String[] args) {
		int num1 = 61;
		int num2 = 8;
		
		int max;
		
		if(num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		
		System.out.println(max);
		
		int max2;
		//       false                this
		max2 = (num1 > num2) ? num1 : num2;
		System.out.println(max2);
		
		String word = 5 > 4 ? "Java" : "Python";
		System.out.println(word);
	
		
		System.out.println(6 < 5 ? "orange" : (7 > 8) ? "orange" : "banana");
		
		//              false
		String str = 5 % 2 != 1 ? (2 % 2 == 0 ? "A" : "B") : "C";
		System.out.println(str);  //C
	}
}
