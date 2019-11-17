package day30_recap;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		/*
		 * Create a map 'days' with values:
		 * 
		 *	 K  |  V
		 *	 1    Mon
		 *	 2	  Tue
		 *	 3	  Wen
		 *	 4	  Thur
		 *	 5	  Fri
		 *	 6	  Sat
		 *	 7	  Sun
		 *
		 *		-> print Sat
		 *		-> print Mon
		 *		-> print all values 
		 *		-> print all keys
		 */
		
		Map<Integer,String> days = new HashMap<>();
		days.put(1,"Mon");
		days.put(2,"Tue");
		days.put(3,"Wen");
		days.put(4,"Thur");
		days.put(5,"Fri");
		days.put(6,"Sat");
		days.put(7,"Sun");
		
		System.out.println(days.get(6));
		System.out.println(days.get(1));
		
		System.out.println(days.values());
		System.out.println(days.keySet());
		
		for(Integer i : days.keySet()) {
			System.out.println(days.get(i));
		}
		
		for(String value : days.values()) {
			System.out.println(value);
		}
		
	}
}
