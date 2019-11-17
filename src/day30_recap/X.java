package day30_recap;

public class X {
	public int i;
	public static int j;
	
	public static void main(String[] args) {
		X x = new X();
		x.i = 4;
		x.j = 3;
		

		X x1 = new X();
		x1.i = 7;
		//x1.j = 9;
		
		System.out.println(x.i +" "+x.j+" "+x1.i+" "+x1.j);
	}
}
