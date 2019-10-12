package day18;

import java.util.Arrays;

public class Assignments {
	public static void main(String[] args) {
		System.out.println(isTheSame("abcd","dcbe"));
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
