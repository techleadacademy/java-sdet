package day8;

import java.util.Random;

public class LuckyNumbers {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(11);
		
		/** TODO
		 * • Generate random number in 1 – 10 range
         * • Assume numbers 7,1,9 are lucky numbers
         * • If user number is luck number, print ‘jackpot’
		 */
		
        
		if( number == 1 ||  number == 7 ||  number == 9) {
			System.out.println(number+" jackpot");
		}else{
	        System.out.println(number+" There is no luck today");	
		}
		
	}
}
