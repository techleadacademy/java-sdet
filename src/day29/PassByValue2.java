package day29;

import java.util.ArrayList;
import java.util.List;

public class PassByValue2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Dimurat");
		names.add("Muhabbat");
		
		PassByValue2 obj = new PassByValue2();
		obj.removeFirstEl(names);
		System.out.println(names);
	}
	
	public void removeFirstEl(List<String> list) {
		list.remove(0);
	}
}
