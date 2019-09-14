package day10;

public class LocalVariables {
	public String str = "hello";
	
    
    public String getSomeStr() {
    	String str = "apple";
    	String myWord = this.str;

    	System.out.println(this.str);  
    	
    	return "something";
    }
    
    public void printVal() {
    	System.out.println("Val");
    }
    
    
    public static void main(String[] args) {
    	LocalVariables obj = new LocalVariables();
        System.out.println(obj.getSomeStr());	
        
    	
	}
    
    
}
