package day9;

public class DogDemo {
    public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Mumu";
		dog1.age = 9;
		dog1.color = "brown";
		//dog1.printDetails();
		//dog1.bark();
		//dog1.run();
		
	    
	    String dogDetails = dog1.getDetails();
	    System.out.println(dogDetails);
	    
	    int humanAge = dog1.getHumanAge();
		System.out.println("Human age of our dog is "+humanAge);
		
		Dog dog2 = new Dog();
		dog2.name = "Bob";
		dog2.age = 4;
		dog2.color = "white";
		
		//dog2.bark();
		//dog2.run();
		//dog2.printDetails();
		dogDetails = dog2.getDetails();
		System.out.println(dogDetails);
		// Break till 9:15
	}
}
