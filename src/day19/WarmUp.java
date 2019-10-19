package day19;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		String[] arr = {"A","BBB","CCC"};
		System.out.println(getLongest(arr));
		
		int[] i = {1,3,4,6,8};
		System.out.println(isG10(i));
		
		System.out.println(isLastEven(i)); 
		
		String[] fruite = {"apple","banana","kiwi"};
		
		System.out.println(Arrays.toString(splitString("insert")));
		
		System.out.println(reverseStr("apple"));
		
		
		String[] arrStr = {"Java","Python","JS"};		
		System.out.println(Arrays.toString(revArr(arrStr)));
		//[JS, Python, Java]
		
		
//		System.out.println(az("bvsds"));
//		System.out.println(az("abc"));
//		System.out.println(az("zyx"));
//		System.out.println(az("rmgb"));
//		System.out.println(az("klmno"));
		
		String[] arr2 = {"Java Savitch", "Head First Java","Clean Code","OCA","OCP"};
		
		System.out.println(isOca(arr2)); // true
	}
	
	public static boolean isOca(String[] arr2) {
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i].equals("OCA")) {
				return true;
			}
		}
	return false;
	
	}
	
	/*
	 * Write a method that accepts String[] array
	 * if argument array contains "OCA" return true
	 * otherwise return false
	 */
	
	
	/*
	 * Write a method that will accept string 
	 * if string is in alphabetic order then return true
	 * else return false
     * 
	 *  char[]  wordAr = word.toCharArray();
	 *  Arrays.sort(wordAr); 
	 *  
	 *  char[] or = word.toCharArray(); 
	 *  
	 * "bvsds" -> false
	 * "abc"   -> true
	 * "fghi"  -> true
	 * "kmno"  -> true
	 * "klmno" -> true
	 * "zyx"   -> false
	 * "rmgb"  -> false
	 */
	
	//                              bca
	public static boolean az(String word) {
		
		char[] wordSorted = word.toCharArray();
		Arrays.sort(wordSorted);	
		char[] origin = word.toCharArray();
		
		
		for(int i = 0; i < origin.length; i++) {
			if(wordSorted[i] != origin[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	

	public static String[] revArr(String[] arr) {
		
		String[] revArr = new String[arr.length];
		//[0][][]
		//[JS][Python][Java]	
		int j = 0;
		//                2
		for(int i = arr.length-1; i >= 0; i--) {
			//     2        0
			revArr[j] = arr[i];
		    j++;
		}
		return revArr;	
	}
	
	
	public static String reverseStr(String str) {
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);			
		}		
		return rev;
	}
	
	
	
	public static char[] splitString(String word) {
		char[] chArr = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			chArr[i] = word.charAt(i);
		}
		
		//chArr = word.toCharArray();
		return chArr;
	}
	
    public static boolean fruites(String[] strArr) {
    	String first = strArr[0];
    	String second = strArr[strArr.length - 1];
    	if(first.equals("apple") && second.equals("kiwi")) {
    		return true;
    	}else {
    		return false;
    	}
    }
	
	public static boolean isLast5(String[] str) {
		String lastEl = str[str.length - 1];
		if(lastEl.length() > 5) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isLastEven(int[] arr) {
		int rem = arr[arr.length-1];
		boolean isEven = rem % 2 == 0;
		return isEven;
	}
	
	
	public static boolean isG10(int[] num) {
		int sum = num[0] + num[num.length - 1];
		return sum >= 10;
	}
	
		
	public static String getLongest(String[] strArr) {
		String max = "";
		for(int i = 0; i < strArr.length; i++) {	
			if(max.length() < strArr[i].length()) {
				max = strArr[i];
			}
		}
		return max;
	}
	
	public static int getMaxElement(int[] num) {
		int max = 0;
		
		for(int i = 0; i < num.length; i++) {	
			//  3  <  6
			if(max < num[i]) {
			//   6   
				max = num[i];
			}
		}
		return max;
	}
}
