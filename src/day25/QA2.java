package day25;



public class QA2 {
	public static void main(String[] args) {
		try {
			m();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//m();
		
	}
	
	public static void m() {
		throw new RuntimeException("Test Exception. Which will tell you why this is happening");
	}
}
