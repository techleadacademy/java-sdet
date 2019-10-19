package day21;

public class Developer extends Person{
	private String progLan;
	private String[] certificates;
	
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.setFirstname("Ramesh");
		dev.setLastname("Kanery");
		dev.setAge(36);
	
		System.out.println(dev);
	}
}
