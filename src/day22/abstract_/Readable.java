package day22.abstract_;

public interface Readable {
	public static final int PAGES = 500;	
	public abstract void read();	
	
	
	
	public default void print() {
		System.out.println("Printing..");
	}
	
	public static void relax() {
		System.out.println("Sleeping..");
	}
	
}
