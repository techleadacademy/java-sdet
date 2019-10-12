package day17;

public class ArrayCreation {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 6;
		
		int[] num1 = {1,3,4,5,6};
		
		int[] num2 = new int[] {1,2,3,4,5};
		
		for(int i : num1) {
			System.out.println(i);
		}
		
		String[] cities = {"Aldie", "Arlington","Tysons"};
		
		for(String city: cities){
			
			if(!city.equals("Aldie")) {
				System.out.println(city.toUpperCase());
			}
			
		}
		
		for(String x : cities)
			System.out.println(x);
		
	}
}
