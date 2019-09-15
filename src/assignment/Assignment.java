package assignment;

public class Assignment {

	/**
	 * Method returns sum of its arguments(parameters) num1 and num2
	 * 
	 * sum(1.5,2.2) -> 3.7
	 * sum(1.0,1.0) -> 2.0
	 * 
	 */
	public double sum(double num1, double num2) {
		//TODO your code goes here
		// please change return statement
		double d = num1 + num2;
		return d;
	}
	
	
	
	/**
	 * Method returns true if num is greater then 100 otherwise false
	 * 
	 * moreThen100(101) -> true
	 * moreThen100(80)  -> false
	 * 
	 */
	public boolean moreThen100(int num) {
		if(num > 100) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	 * 
     * Given 2 ints, a and b, return their sum. 
     * However, sums in the range 10..19 inclusive, are forbidden,
     *  so in that case just return 20.
     * 
     * sortaSum(3, 4)
     * sortaSum(9, 4)
     * sortaSum(10, 11)
	 */
	public int sortaSum(int a, int b) {
		int sum = a + b;
		
		if(sum >= 10 && sum <= 19) {
			return 20;
		}else {
			return sum;
		}
	}
	
	
	/**
	 * Method returns true if num within a range 20-40 inclusive
	 * 
	 * range(24)        -> true
	 * range(80)        -> false
	 * range(8)         -> false
	 * 
	 */
	public boolean range(int num) {
		//TODO your code goes here
		// please change return statement
		return false;
	}
	
	
	
	/**
	 * Method returns true if num within a range 20-40 inclusive,
	 * except if num is 7, 13 or 44 return true 
	 * 
	 * rangeExcept(24)        -> true
	 * rangeExcept(80)        -> false
	 * rangeExcept(8)         -> false
	 * rangeExcept(7)         -> true
	 * 
	 */
	public boolean rangeExcept(int num) {
		if(num >= 20 && num <= 40) {
			return true;
		}else if(num == 7 || num == 13 || num == 44) {
			return true;
		}else{
			return false;
		}
		
	}
	
	
	
	/**
	 * Method returns str with all uppercase letters 
	 * 
	 * makeUppercase("Apple") -> APPLE
	 * makeUppercase("Hello") -> HELLO
	 */
	public String makeUppercase(String str) {
		// TODO your goes here
		// please change return statement
		return null;
	}
	
	
	
	/**
	 * Method returns str with all lowercase letters 
	 * 
	 * makeLowerercase("Phone") -> phone
	 * makeLowerercase("Home")  -> home
	 */
	public String makeLowerercase(String str) {
		// TODO your goes here
		// please change return statement
		return null;
	}
	
	
	
	/**
	 * Method returns new string which is concatenation of str1 and str2
	 * 
	 * addTwoStrs("book", "car") -> bookcar
	 * addTwoStrs("iphone", "nokia") -> iphonenokia
	 */
	public String addTwoStrs(String str1, String str2) {
		// TODO your goes here
		// please change return statement
		return null;
	}
	
	
	
	/**
	 * Method returns first letter of the string
	 * 
	 * getFirstLetter("white") -> w
	 * getFirstLetter("school") -> s
	 */
	public String getFirstLetter(String str) {
		// TODO your code goes here
		// please change return statement
		return null;
	}
	
	
	
	/**
	 * Method returns true if num is even number otherwise it returns false
	 * 
	 * isEven(2) -> true
	 * isEven(3) -> false
	 * isEven(4) -> true
	 */
	public boolean isEven(int num) {
		// TODO your code goes here
		// please change return statement
		return false;
	}
	
	
	/**
	 * Method returns true if length of str is even number otherwise it returns false
	 * 
	 * isEvenLength("apple") -> false
	 * isEvenLength("book")  -> true
	 * isEvenLength("hi")    -> true
	 */
	public boolean isEvenLength(String str) {
		// TODO your code goes here
		// please change return statement
		return false;
	}
	
	
    /**
     * Method returns last 3 letters of the str
     * if str length is less then 3 then return str without modification 
     */
	public String lastThree(String str) {
		// TODO your code goes here
		// please change return statement
		return null;
	}
	
	
    
	/**
	 * 
     * The number 6 is a truly great number. 
     * Given two int values, a and b, return true if either one is 6. 
     * Or if their sum or difference is 6. 
     * 
     * love6(6, 4) → true
     * love6(4, 5) → false
     * love6(1, 5) → true
	 */
	public boolean love6(int a, int b) {
		// TODO your code goes here
		// please change return statement
	    return false;
	}
	
	
	
	/**
	 * Method accepts num number from 1 to 7
	 *  it maps with day of the week
	 *  1 - Monday
	 *  2 - Tuesday
	 *  3 - Wednesday
	 *  4 - Thursday
	 *  5 - Friday
	 *  6 - Saturday
	 *  7 - Sunday
	 *  
	 *  retrun string value based on above logic
	 *  if num is not within 1-7 return "Wrong Input"
	 *  
	 *  dayOfWeek(1) -> Monday
     *
	 */
	public String dayOfWeek(int num) {
		// TODO your code goes here
		// please change return statement
		return null;
	}
	
	
	/**
	 * Method accepts string text
	 * if text contains word "Bob"
	 * return "You got it Bob!"
	 * otherwise return "No Bob"
	 * 
	 * checkBob("asdfdsf fsdfsaf") -> No Bob
	 * checkBob("assasBobs")       -> You got it Bob!
	 */
	public String checkBob(String text) {
		// TODO your code goes here
		// please change return statement
		return null;
	}
	
	/**  
	 *   Method accepts int year. Based on below logic return value 
	 *   
     *   if the year is divisible by 4 but not 100, return "leap year"
     *   if the year is divisible by 400, return "leap year"
     *   for others return "not leap year"
	 */
	public String isLeapYear(int year) {
		// TODO your goes here
		// please change return statement
		return null;
	}
	
	/**
	 *   Method accepts fahrenheit and converts to celsius 
	 *   
	 *   formula - ((fahrenheit - 32) * 5) / 9 
	 * 
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		// TODO your goes here
		// please change return statement
		return 0.0;
	}
	
	
	/**
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they
	 * play if the temperature is between 60 and 90 (inclusive). Unless it is
	 * summer, then the upper limit is 100 instead of 90. Given an int temperature
	 * and a boolean isSummer, return true if the squirrels play and false
	 * otherwise.
	 *
	 * squirrelPlay(70, false) → true 
	 * squirrelPlay(95, false) → false
	 * squirrelPlay(95, true) → true
	 * 
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		// TODO your goes here
		// please change return statement
		return false;
	}

	/**
	 * You are driving a little too fast, and a police officer stops you. Write code
	 * to compute the result, encoded as an int value: 0=no ticket, 1=small ticket,
	 * 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61
	 * and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
	 * Unless it is your birthday -- on that day, your speed can be 5 higher in all
	 * cases.
	 * 
	 * caughtSpeeding(60, false) → 0 
	 * caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 */
	public int caughtSpeeding(int speed, boolean isBirthday) {
		// TODO your code goes here
		// please change return statement
		return 0;
	}
}
