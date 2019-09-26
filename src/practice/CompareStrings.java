package practice;

public class CompareStrings {

	public static void main(String[] args) {
		String a = foodForEveryOne("burger");
		System.out.println(a);
		/*
		 * create a if statement method that will return string value. burgers sushi
		 * fajitas manty
		 */
	}

	public static String foodForEveryOne(String str) {

		if (str.equals("burger")) {
			return "G.G";
		} else if (str.equals("sushi")) {
			return "Merrim";

		} else if (str.equals("fajitas")) {
			return "Ari";

		} else {
			return "No body eats";
		}

	}

}
