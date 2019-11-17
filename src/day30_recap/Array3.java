package day30_recap;


public class Array3 {
	/*
	 * Create an array of type Car which can hold 3 elements
	 * 
	 * -> add three car objects into your array
	 * -> print first element
	 * -> print last element
	 */
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		Car c1 = new Car("bmw","black",50000.00);
		cars[0] = c1;
		
		cars[1] = new Car("tesla","white",750000);
		cars[2] = new Car("range rover","red",100000);
		
		System.out.println(cars[0]);
		System.out.println(cars[cars.length - 1]);
	}
}