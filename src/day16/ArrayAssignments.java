package day16;

public class ArrayAssignments {
	public static void main(String[] args) {
		int[] number = new int[3];
		number[0] = 90;
		number[1] = 120;
		number[2] = -20;
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
			
		System.out.println(number[0]+" "+number[1]+" "+number[2]);
		
		
		double[] temperature = new double[6];
		temperature[0] = 77.8;
		temperature[1] = 100.09;
		temperature[2] = 30.9;
		temperature[3] = 55.6;
		temperature[4] = 73.2;
		temperature[5] = 80.0;
		
		double sum = temperature[0] + temperature[1] + temperature[2] + temperature[3] + temperature[4] + temperature[5];
		//System.out.println("Average1: "+sum / 6);
		
		double sum1 = 0.0;
		//             6
		for(int i = 0; i < 6; i++) {
			//sum1 = sum1 + temperature[i];
			//                  5
			sum1 += temperature[i];
		}
		System.out.println("Average2: "+(sum1/6));
		
	}
}
