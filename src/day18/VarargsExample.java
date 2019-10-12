package day18;

public class VarargsExample {
	public static void main(String[] args) {
		System.out.println(getSum(3,4));
		System.out.println(getSum(6,3,1));
		
		System.out.println(getSum(32,23,4,2,5,6,7));
		
		int[] arr = {1,2,3,4};
		System.out.println(getSum(arr));
		
		int num1 = 9;
		int num2 = 8;
		int num3 = 1;
		System.out.println(getSum(num1,num2,num3));
		System.out.println(getSum(num1));
		
	}
		
	public static int getSum(int ...i) {
		int sum = 0;
		for(int val : i) {
			sum += val;
		}
		return sum;
	}
	
	
}
