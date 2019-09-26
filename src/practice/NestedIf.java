package practice;

import utils.JavaUtils;

public class NestedIf {
	public static void main(String[] args) {
        int num = JavaUtils.getRandomNumber(101);
    	System.out.println(num);
		if(num >= 50 && num <= 60) {

				System.out.println("Num is greater then 50 but not less then 60");
				if(num <= 80) {
					System.out.println("50 - 80");
				}else {
					System.out.println("greater then 50 but not less then 80");
				}
				
				
			
			
			
			
		}else {
		
			System.out.println("out");
			
		}
		
	}
}
