package november10;

import java.util.*;


public class Nov10 {

	public static void main(String[] args) {
		
		/*
		 * 1. Create an int array nums that has a size 10 with following numbers:
		 * 	10,20,30,40,50,60,70,80,90,100
		 */
		 int nums[] = {10,20,30,40,50,60,70,80,90,100};
		 /* 2. Create a String array wordNums that has a size of nums array and all store all elements of
		 * nums array in it
		 */
		 String[] wordNums = new String[nums.length];
		 int i = 0;
		 for (int num : nums) {
			wordNums[i]=num+"";
			i++;
		}
		 //System.out.println(Arrays.asList(wordNums));
		 /* 3. Remove all zeros from each item of wordNums array. Result should have a String elements
		 * like 1,2,3,4,5,6,7,8,9,10
		 */
		 for (int j = 0; j < wordNums.length; j++) {
			wordNums[j] = wordNums[j].substring(0, wordNums[j].length()-1);
		}
		 //System.out.println(Arrays.asList(wordNums));
		 /* 4. Create an Integer ArayList numList and store all items of wordNums in it.
		  */
		 List<Integer> numList = new ArrayList<>();
		 for (int j = 0; j < wordNums.length; j++) {
			numList.add(Integer.parseInt(wordNums[j]));
		}
		 //System.out.println(numList);
		 
		 //System.out.println(name(numList));
		 //6. Create an Integer ArrayList numList2 which will have second half of all items of numList 
		List<Integer> numList2 = numList.subList(numList.size()/2, numList.size());
		System.out.println(numList2);
		
		//
		 
	}
	/* 
	 * 5. Write a program which take an Integer ArrayList and sums every other element of an array
	 * starting from first one. Will return the result of sum.
	 * Output:
	 * 	sum of 1+3+5+7+9
	 */
	public static int name(List<Integer> ls) {
		int sum=0;
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i)%2==1) 
			sum += ls.get(i);
		}		
		return sum;
	}

}
