package practice;

public class PracticeClass {
	public static void main(String args[]) {
		
		getAge(21);
		
	}

	public static  boolean getAge(int age) {
		
		
		
		if(age>=18) {
			
			System.out.println("Eligible");
			return true;
		
		}else {
			
			System.out.println("Not eligible");
			return false;
			
		}
		
	}	
		
	}


