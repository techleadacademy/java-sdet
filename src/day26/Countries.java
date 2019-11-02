package day26;

import java.util.ArrayList;

public class Countries {
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("Russia");
		countries.add("Ukraine");
		countries.add("Bolivia");
		countries.add("Kazakhstan");
		
		// add -> to add new element
		// get(index)
		// size()
		// print each element in the separate line using loop 
		
		//             5 < 5 -> false
		for(int i = 0; i < countries.size(); i++) {
			//                               4
			//System.out.println(countries.get(i));
		}
		
		System.out.println(countries);
		countries.remove(1); // remove by index
		System.out.println(countries);
		
		countries.remove("Ukraine"); // remove by value
		System.out.println(countries);
		
		}
}
