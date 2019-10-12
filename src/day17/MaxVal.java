package day17;

public class MaxVal {
public static void main(String[] args) {
	int[] arr = {100,43,235,3};
	
	int max = 0;
	for(int i = 0; i < arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}	
	}
	System.out.println(max);
}
}
