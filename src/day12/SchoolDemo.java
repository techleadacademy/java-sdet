package day12;

public class SchoolDemo {
	public static void main(String[] args) {
		School tla = new School();
		tla.name = "Tech Lead Academy";
		tla.address = "10090 Main st";
		tla.isSummer = true;
		tla.currentDate = "09/26/19";
		tla.printDetails();
		
		System.out.println("===========");
		
		School cd = new School();
		cd.name = "CodingDojo";
		cd.address = "Arlington";
		cd.isSummer = false;
		cd.currentDate = "09/26/19";
		cd.printDetails();
		
		
		
		
	}
}
