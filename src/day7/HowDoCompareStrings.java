package day7;

public class HowDoCompareStrings {
    public static void main(String[] args) {
		String str =  "java";
		String str3 = "java";
		
		String str1 = new String("java");
		
		System.out.println(str == str1);// never use this way to compare values of string
		
		System.out.println( str.equals(str1) ) ; 
		System.out.println( str +" : "+str1 );
		
	}
}
