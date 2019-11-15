package november9;
import java.util.*;
public class LearningLinkedList {
	public static void main(String[] args) {
		/*
		 * declare an arrayList of 15 elements of type int.
		 * output the value on the tenth element of the array
		 * set the value of the fifth element to 35
		 * set the value of ninth of the array to the sum of the sixth and thirteenth element of array
		 */
		List<Integer> ls = new ArrayList<>();
		//List<Integer> ls1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		for (int i = 1; i <= 15; i++) {
			ls.add(i);
		}
//		System.out.println(ls);
//		System.out.println(ls.get(9));
//		ls.set(4, 35);
//		System.out.println(ls);
//		ls.set(8, ls.get(5)+ls.get(12));
//		System.out.println(ls);
		
		/*
		 * create 2 ArrayLists, 1. name:nums - Integer with 5 numbers, 2. name:words - String with 5 words
		 * create and arrayList MASTER which would store 2 ArrayLists (types Integer and String) above created lists
		 * print out the values of list MASTER
		 */
		List<Integer> nums = new ArrayList<>(Arrays.asList(5,6,7,8,9));
		List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		List<Object> master = new ArrayList<>();
		master.add(nums);
		master.add(words);
		System.out.println(master);
		
		List<Integer> nums1 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
		List<Integer> nums2 = new ArrayList<>(Arrays.asList(55,66,77,88,99));
		List<Object> master1 = new ArrayList<>();
		master1.add(nums1);
		master1.add(nums2);
		System.out.println(master1);
	}
	
	/*
	 * write a program that creates an ArrayList of 10 elements size. Your program will ask user to input numbers in array
	 * and then display sum of all ArrayList elements
	 */
	
	

}
