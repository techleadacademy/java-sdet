package day12;

public class Security {
	
    public static void printWord() {
    	System.out.println("Access Denied!");
    }
    
    public void printWordReg() {
    	System.out.println("Access De from Reg");
    }
    
    public static String getWord(String word) {
    	return word + "!";
    }
    
}
