package day22.abstract_;

public class Assignment {
	
	public static void main(String[] args) {
		String[] arr = {"JAVA CERT", "OCP", "AWS", "SRUM", "OCA"};
		certHi(arr);
	}
	
	public static void certHi(String[] arrs) {
		
		for(String str : arrs) {
			if(str.equals("OCA")) {
				System.out.println("Certified! Yoo!");
				return;
			}
		}
		System.out.println("Keep Studying!");
	}
}
