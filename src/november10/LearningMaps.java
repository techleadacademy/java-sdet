package november10;
import java.util.*;

public class LearningMaps {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("abc");
		list.add("bca");
		list.add("cba");
		list.add("cba");
		System.out.println(list);

		Set<String> set=new HashSet<>();
		set.add("abc");
		set.add("bca");
		set.add("cba");
		set.add("cba");
		System.out.println(set);
		
		String s="hello";
		
		Set<Character> sSet=new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			sSet.add(s.charAt(i));
		}
		System.out.println(sSet);
		
		
		
		
	
		System.out.println(sSet);
		for(char each: sSet) {   //ehlo
			int  count=0;
			for(int i=0; i<s.length(); i++) { //hello
				if(each==s.charAt(i)) {
					count++; //5
				}
				
			}
			System.out.println(each+" : "+count);
			
		}
		
		
		
	}

}
