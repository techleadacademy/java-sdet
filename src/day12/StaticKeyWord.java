package day12;

public class StaticKeyWord {
	static String date = "09/26/2019"; 
	String name;
	
	
    public static void main(String[] args) {
    	myStaticMethod();
    	//regularMethod();
    	
    	StaticKeyWord obj = new StaticKeyWord();
    	obj.regularMethodTwo();
	}
    
    public static void myStaticMethod() {
    	System.out.println("From Static method");
    	System.out.println(date);
    	
    	// Does not compile because name is not static
    	//System.out.println(name);
    }
    
    public void regularMethod() {
    	System.out.println("From regular method");
    	
    }
    
    public void regularMethodTwo() {
    	regularMethod();
    	myStaticMethod();
    }
    
    
    
    
}
