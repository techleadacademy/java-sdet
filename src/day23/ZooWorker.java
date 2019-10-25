package day23;

public class ZooWorker {
	
	public static void main(String[] args) {
		Reptile reptile = new Reptile();
		feed(reptile);
		
		Crocodile gena = new Crocodile();
		feed(gena);
		
		Alligator aligator = new Alligator();
		feed(aligator);
	}
	
	public static void feed(Reptile reptile) {
		System.out.println("Feeding "+reptile.getName());
	}
	
}
