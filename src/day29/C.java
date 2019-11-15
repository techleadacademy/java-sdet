package day29;

public class C {
	public static void main(String[] args) {
		C c = new C();
		c.sum(2);
		c.sum(2,4);
		
		c.sum(2,3,4,6,7,8,4);
		
		long[] ar = new long[10];
		c.sum(ar);
		
	}
	
	public void sum(int i, int i1) {
		System.out.println(i + i1);
	}
	
	public void sum(int i) {
		System.out.println(i);
	}
	
	public void sum(long i) {
		System.out.println(i);
	}
	
	public void sum(long... i) {
		System.out.println(i);
	}

}
