package november9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nov9 {

	public static void main(String[] args) {
		
		/*
		 * create a method which will take a String array as an argument
		 * and returns String ArrayList with the content of given array
		 */
		String[] arr = {"a", "b", "c", "d", "e", "f"}; //"x"
						// a, b, d, e, f
		
		/*
		 * create and arraylist out of array String[] arr, having objects from index 2 to 4
		 */
		
//		System.out.println(arr);
//		System.out.println(arrayToList(arr));
//		
//		ArrayList<Integer> list = new ArrayList<>(); list.add(4);
//		List<String> ls = new ArrayList<>(); ls.add("ad");
		ArrayList<String> list1 = new ArrayList<>(110);
		list1.add("a"); 
		list1.add("b");
		list1.trimToSize();
		
		
		List<String> list2 = Arrays.asList(arr);
		List<String> list6 = new ArrayList<>(Arrays.asList(arr));
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<String> list5 = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(list5.subList(0, 3));
		Collections.reverse(list5);
		Collections.synchronizedList(list5); // to synchronize the ArrayList
		System.out.println(list5);
		
		
		
		
		
	}
	
	public static ArrayList<String> arrayToList(String[] arr) {
		ArrayList<String> list = new ArrayList<>();			
		for(String s: arr) {
			list.add(s);
		}
		return list;
	}
	
	public static List<String> arrayToList1(String[] arr) {				
		return Arrays.asList(arr);
	}

}
