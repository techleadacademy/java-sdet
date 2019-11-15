package day29;

public class PassByValue {
	public static void main(String[] args) {
		//Primitives - int
		int i = 1;
		incrByOne(i);
		System.out.println(i);
		
		//Object - StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		addWorld(sb);
		System.out.println(sb);
		
		String str = "hello";
		addWorld(str);
		System.out.println(str);
	}
	
	public static void incrByOne(int number) {
		//int i1 = number;
		
		number = number + 1;
	}
	
	public static void addWorld(StringBuilder sb) {
		//StringBuilder sbt = sb;
		sb.append(", World!");
	}
	
	public static void addWorld(String str) {
		str = str + ", world";
	}
}
