package day26;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		
		ArrayList<Long> rNumbers = getRandomList(10);		
		System.out.println(rNumbers);
		
		//Write a code to find out average value of this arrayList numbers
		// Get Average
		long sum = 0;
		for(int i = 0; i < rNumbers.size(); i++) {
			sum += rNumbers.get(i);
		}
		System.out.println("Average: "+ sum / rNumbers.size());
		System.out.println("======================");
		

	
	}
	
	/**
	 * This method will return list with random numbers
	 * @param size
	 * @return ArrayList<Long>
	 */
	public static ArrayList<Long> getRandomList(int size){
		ArrayList<Long> rList = new ArrayList<>();
		Random r = new Random();	
		for(int i = 0; i < size; i++) {
			rList.add( (long)r.nextInt(1000) );
		}	
		return rList;
	}
	
	
}
