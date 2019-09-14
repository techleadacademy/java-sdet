package day10;

public class AccessModifiers {
    /**
     * public - accessible everywhere
     * 
     * private - only inside class
     * 
     * protected - 
     * 
     * default
     */
	
	private String strPrivate = "LAST VALUE";
	public String strPublic;
	
	private String getStrPrivate() {
		return strPrivate;
	}
	
	protected void sayGood() {
		System.out.println("Good!!");
	}
	
	void sayAwesome() {
		System.out.println("Awesome!!");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.strPrivate = "New Value";
	}
}
