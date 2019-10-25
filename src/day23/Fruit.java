package day23;

public class Fruit {
	public static void main(String[] args) {
		Bird b = new Bird();
		//Fruit f = (Fruit)b; Not Compile 
		// Classes not related (no link)
		
		Bird bird = new Bird(); 
		Eagle eagle = (Eagle)bird; 
		
		Eagle eg = new Eagle();
		Bird b1 = (Eagle)eg;
		
		
	}
}
