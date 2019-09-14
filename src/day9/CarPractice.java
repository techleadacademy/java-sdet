package day9;

public class CarPractice {
    public static void main(String[] args) {
		Car bmw = new Car();
		bmw.model="BMW-i325";
		bmw.color = "red";
		bmw.speed = 55;
		bmw.year = 2019;
		bmw.drive();
		int bmwYear = bmw.getYear();
		System.out.println(bmwYear);
		
		Car honda = new Car();
		honda.model = "civic";
		honda.color = "grey";
		honda.speed = 65;
		honda.drive();
	}
}
