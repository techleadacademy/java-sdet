package day24;

public class Patient {
	private int age;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int patientAge) {
		if(patientAge < 0) {		
			//System.out.println("Age cannot be negative");
			throw new NullPointerException("Age cannot be negative");			
		}else {			
			this.age = patientAge;		
		}
		
	}
	
	public static void main(String[] args) {
		Patient p = new Patient();
		System.out.println("before exception");
		
		p.setAge(2);
		
		System.out.println("after exception");
		System.out.println(p.getAge());
	}
	
	
}
