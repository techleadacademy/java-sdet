package day22;

public class OverloaadingM  {
	public static void main(String[] args) {
		m(5);
		m("Hello World");
		m();
	}
	
	public static void m() {
		System.out.println("Hello World");
	}
	
	public static String m(String str) {
		System.out.println(str);
		return str;
	}
	
	public static void m(int i) {
		System.out.println(i);
	}
	
}
