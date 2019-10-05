package day12;

public class WhileLoop3 {
	public static void main(String[] args) {
       /*
        * 5 4 3 2 1 0
        */
		
		int controller = 5;
		//      3  >= 0
		while(controller >= 0) {
			//               5 4 3
			System.out.print(controller+" ");
			controller--;
		}
	}
}
