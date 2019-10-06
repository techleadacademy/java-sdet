package day16;

public class ArrayCreation {
	public static void main(String[] args) {
		int[]score = new int[5];
		score[0] = 70;
		score[4] = 80;
		score[1] = 90;
		score[2] = 70;
		score[3] = 60;
		
//      it does not Compile -> IndexOutOfBounds!		
//		//    6th
//		score[5] = 0;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		//it does not Compile -> IndexOutOfBounds!
		//System.out.println(score[5]);
		
		// 7200  
		//score[4] = score[3] * 120;
		
		//           70   +    80
		score[1] = score[0] + score[4];
		
		System.out.println("---");
		System.out.println(score[1]);
		System.out.println("---");
		
		System.out.println(score[0]);
		System.out.println(score[4]);
				
	}
}
