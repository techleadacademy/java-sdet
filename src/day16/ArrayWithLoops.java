package day16;

public class ArrayWithLoops {
	public static void main(String[] args) {
		String[] fruits = new String[3];
		fruits[0] = "apple";
		fruits[1] = "banana";
		fruits[2] = "kiwi";
		
		//             3 < 3
		for(int i = 0; i < 3 ; i++) {
			//                        3 
			System.out.println(fruits[i]);
		}
		
		
		int[] num = new int[1000];
   
		for(int i = 0; i < 1000; i++) {
			//  6  = 
			num[i] = i;
		}
		
		System.out.println(num[999]); 
 		System.out.println(num[998]); 
 		System.out.println(num[997]);
 		System.out.println(num[0]);
 		
 		String[] hello = new String[10];
 		
 		for(int i = 0; i < 10; i++) {
 			hello[i] = i+" Hello World";
 		}
 		
 		for(int i = 0; i < 10; i++) {
 			System.out.println(hello[i]);
 		}
 		
 		String[] team = new String[3];
 		team[0] = "Bob";
 		team[1] = "John";
 		team[2] = "Beknazar";
 		for(int i = 0; i < 3; i++) {
 			System.out.println(team[i]);
 		}
 		
		
	}
}
