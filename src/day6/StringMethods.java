package day6;

public class StringMethods {
	public static void main(String args[]) {
		/*
		 *  length() -> to count how many chars in String
		 */
		String str = "hello World";
		
		int len = str.length();
		System.out.println(len);
		
		String st = new String("432$#@");
		
		String str1 = "432$#@";
		System.out.println(str1.length());
		
		System.out.println("abc".length());	
		
		System.out.println(st.length());
		
		
		/*
		 * toUpperCase(); -> converts to upper case 
		 */
	    str = "java";
	    String str2 = str.toUpperCase();
	    
	    //System.out.println(str +":"+str2);
	    //System.out.println(str.toUpperCase()+":"+str);
	    
	    /*
	     * indexOf(string) -> to get a index of certain string
	     */
	    //     01234
	    str = "apple";
	    int index = str.indexOf("l");
	    System.out.println(index);
	    
	    //     0123456789101112
	    str = "python";
	    System.out.println(str.indexOf("h"));
	    
	    //     0123456789
	    str = "JavaScript";
	    System.out.println(str.substring(0,4));
	    
	    //     012
	    str = "php";
	    System.out.println(str.indexOf("h"));
	    
	    /*
	     * charAt(index); -> char 
	     */
	    
	    //     0123
	    str = "home";
	    char ch = str.charAt(1);
	    System.out.println(ch);
	    
	    //     012345
	    str = "Public";
	    char ch2 = str.charAt(0);
	    System.out.println(ch2);
	    
	    String word = "reorpen";
	    String wordMod = word.replace("e","y");
	    System.out.println(wordMod);
	    
	    word = "Hello";
	    //                      old      new
	    wordMod = word.replace("Hello", "");
	    System.out.println(wordMod);
	    
	    
	    
	}
}
