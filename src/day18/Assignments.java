package day18;

import java.util.Arrays;

public class Assignments {
	public static void main(String[] args) {
		//System.out.println(isTheSame("abcd","dcbe"));
		
		//System.out.println(reverseStr("abc"));
		String[] arr = {"a","b","c"};
		System.out.println(Arrays.toString(reverseArr(arr)));
		
		int[] nums = {3,2,4,2};
		System.out.println(isSeven(nums)); 
	}
	
	/**
	 * Method will accept int[] number
	 * it will return true if array number contains 7
	 * otherwise it will return false
	 * 
	 */
	public static boolean isSeven(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 7) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static String[] reverseArr(String[] arr) {
		String[] rev = new String[arr.length];
		
		int j = 0;
		for(int i = arr.length - 1; i >= 0; i--) {       
			rev[j] = arr[i];
			j++;
		}
			
		return rev;
	}
	
	 
	//                                  01234
	//                                 "apple"
	public static String reverseStr(String str) {
		String rev = "";
		//                           -1 >= 0
		for(int i = str.length() - 1; i >= 0; i--) {
		//	 "elppa" =  "elpp" + 'a'
			rev = rev + str.charAt(i);
		}
		
		return rev;
	}
	
	public static String reverseStb(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	
	
	  public static boolean isTheSame(String s1, String s2){
		  char[] sCh1 = getChars(s1);
		  char[] sCh2 = getChars(s2);
		  
		  Arrays.sort(sCh1);
		  Arrays.sort(sCh2);
		  
		  System.out.println(Arrays.toString(sCh1));
		  System.out.println(Arrays.toString(sCh2));
		  
		  if(isArrsEqual(sCh1, sCh2)) {
			  return true;
		  }else {
			  return false;
		  }
	  }
	  
	  public static char[] getChars(String str) {
		  char[] chars = new char[str.length()];
		  for(int i = 0; i < str.length(); i++) {
			  chars[i] = str.charAt(i);
		  }
		  return chars;
	  }
	  
	  public static boolean isArrsEqual(char[] ch1, char[] ch2) {
		  if(!(ch1.length == ch2.length)) {
			  return false;
		  }
		  
		  for(int i = 0; i < ch1.length; i++) {
			  if( ch1[i] != ch2[i]) {
				  return false;
			  }
		  }
		  
		  
		  return true;
	  }

}
