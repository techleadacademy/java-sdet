package day9;

public class Dog {
    public String name;
    public int age;
    public String color;
    
    public void printDetails() {
    	System.out.println("name is "+name);
    	System.out.println("age is "+age);
    	System.out.println("color is "+color);
    }
    
    public void bark() {
    	System.out.println(name + " is barking..");
    	System.out.println("Guw Guw Guw..");
    }
    
    public void run() {
    	System.out.println(name + " is running");
    }
    
    public String getDetails() {
    	String details = name+" "+age;
    	return details;
    }
    
    public int getHumanAge() {
    	int humanAge = 0;
    	
    	if(age <= 2) {
    		humanAge = age * 11;
    	}else {
    		humanAge = 22 + ((age - 2) * 5);
    	}
    	return humanAge;
    }
}
