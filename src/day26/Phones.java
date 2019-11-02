package day26;

import java.util.ArrayList;

public class Phones {
	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("nokia");
		phones.add("google");
		phones.add("LG");
		
		System.out.println(phones);
		phones.remove(1);
		System.out.println(phones);
		phones.remove("google");
		System.out.println(phones);
		
		phones.clear(); // to remove all elements from list
		System.out.println(phones);
	}
}
