package day26;

import java.util.ArrayList;

public class Cities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Hyannis");
		cities.add("Arlington");
		cities.add("Karaganda");
		
		System.out.println(isCityThere("Hyannis",cities));
		
		System.out.println(cities.contains("Bishkek"));
		System.out.println(cities.indexOf("Arlington"));
	}
	
	public static boolean isCityThere(String city, ArrayList<String> cities) {
		for(String cityFromList : cities) {
			if(cityFromList.equals(city)) {
				return true;
			}
		}		
		return false;
	}
	
	
	
	
}
