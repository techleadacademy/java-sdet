package day22.abstract_;

public abstract class Vehicle {
	public int serialNumber;
	public String type;
	
	public void printDet() {
		System.out.println("DET");
	}
	
	public void transport() {
		System.out.println("Transporting..");
	}
	
	public abstract String getType();
	public abstract void driving();
	public abstract void fly();
}
