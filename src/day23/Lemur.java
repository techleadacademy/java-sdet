package day23;

public class Lemur extends Primate implements HasTail{
	
	@Override
	public boolean hasTail() {
		return true;
	}
	
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		lemur.hasTail();
		
		Primate primate = lemur;
		
		
		primate.printAge();
		System.out.println(primate.age);
		
		
		Primate primate1 = new Lemur();
		Lemur lem = (Lemur)primate1;
		
		Primate pr2 = new Primate();
		Lemur lem2 = (Lemur)pr2;
		
		
		
		
		
		
		
	}
	
}
