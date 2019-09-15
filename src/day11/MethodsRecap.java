package day11;

public class MethodsRecap {
	
	public static void main(String[] args) {
//        sayHello();
//        sayWord("Mute");
 //       printNumbers(6,8);
 //       printNumbersTernary(11, 20);
//          String str = getNumbers(12,11);
//          System.out.println(str);
//		  int result = getMax(6,3,29);
//		  System.out.println(result);
		
		// Lunch till 1 PM
		
//		String str = getTwoFirstLetters("hello");
//		System.out.println(str);
//		
//		System.out.println(getTwoFirstLetters("banana"));
//		System.out.println(getTwoFirstLetters("Sunday"));
//		
//		sayHello();
		
		String s1 = strThreeTimes("eclipse");
		System.out.println(s1);

		  
	}
	
	public static void sayHello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	public static void sayWord(String word) {
		System.out.println(word);
	}
	
	// if i is greater then j -> print i first then j
	// if j is greater then i -> print j first then i
	//                                  6      8
	public static void printNumbers(int i, int j) {
		if(i > j) {
			System.out.println(i +" "+j);
		}else {
			System.out.println(j +" "+i);
		}
	}
	
	
	// if num1 is greater then num2 -> print num1 first then num2
	// if num2 is greater then num2 -> print num2 first then num1
	// with ternary
	public static void printNumbersTernary(int num1, int num2) {
       String str = num1 > num2 ? num1+" "+num2 : num2+" "+num1;
       System.out.println(str);
	}
	
	
	// method name is getNumbers 
	// return type is String
	// if i is greater then j -> return i first then j
	// if j is greater then i -> return j first then i
	
	public  static String getNumbers(int i, int j) {
		String output;
		if(i > j) {
			output = i+" "+j;
		}else {
			output = j+" "+i;
	    }
		return output;
	}
	
	
	public static int getMax(int num1, int num2, int num3) {
		int  max = 0;
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if(num2 > num1 && num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
	
		return max;
	}
	
	
	// create a method which returns String
	// method accepts one String argument
	// return first two letters of string
	public static String getTwoFirstLetters(String str) {
		String firstTwoLetter = str.substring(0,2);
		return firstTwoLetter;
	}
	
	
	// create a method strThreeTimes
	// method returns String
	// method accepts one string argument
	// it returns three times its string argument
	
	// strThreeTimes("hello") -> hellohellohello
	// strThreeTimes("Apple") -> AppleAppleApple
	
	public static String strThreeTimes(String str) {
		String strThree = str+str+str;
		return strThree;
	}
	
	
	

}
