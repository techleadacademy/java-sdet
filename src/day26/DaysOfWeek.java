package day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DaysOfWeek {
	public static void main(String[] args) {
		ArrayList<String> daysOfWeek = new ArrayList<>();
		daysOfWeek.add("Mon");
		daysOfWeek.add("Tue");
		daysOfWeek.add("Wen");
		daysOfWeek.add("Thur");
		daysOfWeek.add("Fri");
		daysOfWeek.add("Sat");
		daysOfWeek.add("Sun");
		
		System.out.println(daysOfWeek);
		daysOfWeek.set(0, "Sat");
		daysOfWeek.set(1, "Sun");
		daysOfWeek.set(5,"Mon");
		daysOfWeek.set(6,"Tue");
		System.out.println(daysOfWeek);
		//swap Mon, Tue with Sat, Sun
		//[Sat, Sun, Wen, Thur, Fri, Mon, Tue]
		
		// there is set(index,vale) to replace the value of element
		
		
		//Arrays is helper class for array
		//Collections is helper class for Collections (ArratList, Map, Set, LinkedList, Queue, Dequeue)
		Collections.swap(daysOfWeek, 0, 5);
		Collections.swap(daysOfWeek, 1, 6);
		System.out.println(daysOfWeek);
		
		

	}
}
