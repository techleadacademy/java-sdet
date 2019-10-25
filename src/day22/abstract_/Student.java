package day22.abstract_;

public class Student implements Readable, Codable{

	@Override
	public void read() {
		System.out.println("Reading..");		
	}
	
	@Override
	public void code() {
		System.out.println("Coding..");
	}
	
	public static void main(String[] args) {
		Readable.relax();
		
	}
	

}
