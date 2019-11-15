package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("B");
		strList.add("c");
		strList.add("4");
		
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList); // 4 B a c
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("Ab");
		strList1.add("Adf");
		strList1.add("A3d");
		strList1.add("aBc");
		strList1.add("123");
		System.out.println(strList1);
		Collections.sort(strList1);
		System.out.println(strList1); // 123 A3d Ab Adf abc
	}
}
