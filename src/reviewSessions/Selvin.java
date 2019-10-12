package reviewSessions;

public class Selvin {
	public static void main(String[] args) {
		 Selvin sv = new Selvin();
		 System.out.println(sv.reverse("hello"));

		 
	}
	
	public static String reverse(String str) {
		String out = "";
		for(int i = str.length()-1; i >= 0; i++) {
			out += str.charAt(i);
		}
		return out;
	}

	 
}
   