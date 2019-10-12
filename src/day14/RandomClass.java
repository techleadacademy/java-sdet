package day14;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		String rS = getRandomStudent();
		System.out.println(rS);
			

	}

	public static String getRandomStudent() {
		Random random = new Random();
		int num = random.nextInt(17);

		switch (num) {
		case 1:
			return "Edil Aibashov";
		case 2:
			return "Mark Admana";
		case 3:
			return "Yulduz Abakirova";
		case 4:
			return "Ariunaa Dasj";
		case 5:
			return "Aizhamal Arzymatova";
		case 6:
			return "Selvin Asencio";
		case 7:
			return "Akylbek Cholurov";
		case 8:
			return "Frank Hernandez";
		case 9:
			return "Nurgazy Ibraimov";
		case 10:
			return "Evelyn Jorge-Vidaurre";
		case 11:
			return "Anna Luchenkova";
		case 12:
			return "Gulzhana Malikova";
		case 13:
			return "Rocio Rodriguez-soto";
		case 14:
			return "Daniel Senzano";
		case 15:
			return "Job Senzano";
		case 16:
			return "Meerim Zhumasheva";
		default:
			return getRandomStudent();
		}

	}

}