package day26;

import java.util.*;

public class Languages {
	public static void main(String[] args) {
		// Create an arrayList
		// add those languages: English, Russian, Arabic, Turkish
		// Print your arrayList
		ArrayList<String> lan = new ArrayList<>();
		lan.add("English");
		lan.add("Russian");
		lan.add("Arabic");
		lan.add("Turkish");
		lan.add("Kyrgyz");
		
		System.out.println(lan);
		System.out.println("The size of list: "+lan.size());
	}
}
