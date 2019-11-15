package day29;

import java.util.ArrayList;
import java.util.List;

public class PassByValue1 {
	public static void main(String[] args) {
		List<Integer> lNum = new ArrayList<>();
		addContent(lNum);
		//System.out.println(lNum);
		
		boolean flag = false;
		setTrue(flag);
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static void setTrue(boolean f) {
		//
		f = true;
	}
	
	public static void addContent(List<Integer> nums) {
		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
	}
}
