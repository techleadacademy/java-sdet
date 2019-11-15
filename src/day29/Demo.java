package day29;

public class Demo {
	public static void main(String[] args) {
		Parent obj = new Child();
		
		obj.run();
		obj.write();
		
		//read is not visible 
		//obj.read();
	}
}
