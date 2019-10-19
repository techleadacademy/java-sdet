package day21;

public class WarmUp {
	public static void main(String[] args) {
		printP(17);
	}
	/*  Write a method that takes one int argument
	 *  Method will print pyramid based on argument
	 *  int argument range is 1 to 10
	 *  
	 *  printP(7);
	 *  
	 *  #
	 *  ##
	 *  ###
	 *  ####
	 *  #####
	 *  ######
	 *  #######
	 *  __________
	 *  
	 *  pruntP(2);
	 *  
	 *  #
	 *  ##
	 *  ___________
	 *  
	 *  printP(12);
	 *  Wrong Input
	 *  
	 *  ___________
	 *  
	 *  printP(5);
	 *  
	 */
	public static void printP(int size) {
		if(size <= 0 || size > 10) {
			
			System.out.println("Wrong Input");
			
		}else {
			
			String hashes = "#";
			for(int i = 0; i < size; i++) {
				System.out.println(hashes);
				hashes += "#";
			}
			
		}
	}
	
}
