package day16;

public class ArrayLength {
	public static void main(String[] args) {
		
		String[] student = new String[15];
		
		//System.out.println(student.length);
		System.out.println(student[14]);
		
		int[] arrNum = new int[19];
		//System.out.println(arrNum.length);
		
		//                           19
		//System.out.println(arrNum[ arrNum.length - 1 ]);
		
		String[] fruit = new String[3];
		fruit[0] = "banana";
		fruit[1] = "apple";
		fruit[2] = "kiwi";
		
		printArr(fruit);
		
		System.out.println("=========");
		
		String[] address = new String[10];
		printArr(address);
		
	}
	
	public static void printArr(String[] strArr) {
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
}
