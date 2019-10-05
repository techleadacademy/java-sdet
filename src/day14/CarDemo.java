package day14;

public class CarDemo {
   public static void main(String[] args) {
	  Car car1 = new Car();
	  Car car2 = new Car();
	  
	  Car car3 = car2;
	  
	  System.out.println(car1 == car2);
	  
	  System.out.println(car3 == car2);
	  
	  int i = 8;
	  int j = 8;
	  System.out.println(i == j);
	  
   }
}
