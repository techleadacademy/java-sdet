package day24;

public class FlinallyBlock {
	public static void main(String[] args) {
		try {
			
			String str = null;
			str.isBlank();
			
		}catch(NullPointerException e) {
			System.out.println("Exception is here handled");		
		}finally {	
			System.out.println("inside finally block");		
		}		
	}
	
	
}
