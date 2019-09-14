package day7;

public class StringEquals {
    public static void main(String args[]) {
    	// always compare strings with equals method
    	String str = "apple";
    	System.out.println("Line 7: "+str.equals("apple"));
    	
    	
    	String str1 = "oranGe";
    	String str2 = "Orange";
    	
    	System.out.println(str1.equals(str2));
    	
    	// Thats how we make it not case sensitive
    	System.out.println("Line 16: "+str1.toUpperCase().equals(str2.toUpperCase()));
    	
    	// or we can use equalsIgnoreCase
    	System.out.println("Line 19: "+str1.equalsIgnoreCase(str2));
    	
    	String str3 = "hello";
    	String str4 = "good";
    	System.out.println(str3.equals(str4));
    	
    }
}
