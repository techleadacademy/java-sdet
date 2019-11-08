package day28;

public class Chocolate {
	public static String str;
	public String str1;
	public String str2;
	
	{
		System.out.println(str1);		
		str = "Dove";
		str1 = "Raffaello";
		str2 = "La Maison";
	}
	
	static {
		System.out.println(str);
		str = "Godiva";
	}
	
	public Chocolate() {
		System.out.println(str2);
		str = "Merci";
		str1 = "Rocher";
		str2 = "Toffee";
	}
	
	public static void main(String[] args) {
		Chocolate chocolate = new Chocolate();
		System.out.println(chocolate.str);
		System.out.println(chocolate.str1);
		System.out.println(chocolate.str2);
	}
	// null, null, La Maison, Merci, Rocher, Toffee
}