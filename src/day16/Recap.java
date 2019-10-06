package day16;

public class Recap {
    public static void main(String[] args) {
    	Recap.printWord("run");
    	
    	
    	System.out.println(Recap.returnNum(100));
    	
    	System.out.println(Recap.returnNum(5));
    	
    	String str = "apple";
    	str = str + ", banana";
    	
    	StringBuilder stb = new StringBuilder("apple");
    	stb.append(", banana");
    	
    	// Its not compiling
        // StringBuilder stb1 = stb + ", kiwi";
    	

    	
	}
    
    //                                  "run"
    public static void printWord(String word) {
    	System.out.println(word.toUpperCase());
    }
    
    //                            num = 5
    public static int returnNum(int num) {
    	// num = 5;
    	if(num > 10) {
    		return num * 2;
    	}else {
    		return num;
    	}
    }
    
}
