package day10;

public class Recap {
	public String str;

	public void sayHello() {
		System.out.println("Hello!");
	}
	
	public String getHello() {
		String hello = "helloooo";
		return hello;
		
	}
	
	// Arguments(parameters) of method - The way to provide data to method
	//                           "Frank"
	public void sayHelloTo(String name) {
		System.out.println("Hello "+name);
	}
	//. sayHelloTo("Frank")
	
	
	
	public void saySomething(String something , int number) {
		if(number > 5) {
			System.out.println(something);
		}else {
			System.out.println("nothing to say!");
		}		
	} 


	
	
	public static void main(String[] args) {
		Recap obj1 = new Recap();
		obj1.str = "apple";
        obj1.sayHello();
        
       
        
        
       // String wordHello = obj1.sayHello();  does not compile. Cannot assign void to String
        
        String wordHello = obj1.getHello();
        System.out.println(wordHello);
        
        String str1 = "good";
        str1 = obj1.getHello();
        System.out.println(str1);
        
        System.out.println("35 "+obj1.str);
        
        Recap obj2 = new Recap();
        obj2.str = "kiwi";
        System.out.println("38 "+obj2.str);
        
        obj2.sayHelloTo("Frank");
        
        obj2.saySomething("Good night",7);  
        obj2.saySomething("Good morning",2); 
        
        // Break till 11:24 AM EST
        
	}
}
