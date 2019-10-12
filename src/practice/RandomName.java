package practice;

import java.util.Random;

public class RandomName {
	   public static void main(String[] args) {
	        randomName();
	    }
	    public static void randomName() {
	        int counter = 1;
	        String list = "";
	        while (counter <= 16) {
	            String rS = printRandomStudent();
	            if (!list.contains(rS)) {
	                System.out.println(rS);
	                counter++;
	                list += rS;
	            }
	        }
	    }
	    public static String printRandomStudent() {
	        Random random = new Random();
	        int student = random.nextInt(16);
	        switch (student) {
	        case 1:
	            return ("Edil Aibashov");
	        case 2:
	            return ("Mark Admana");
	        case 3:
	            return ("Yulduz Akabirova");
	        case 4:
	            return ("Ariuna Dasj");
	        case 5:
	            return ("Aizhamal Arzymatova");
	        case 6:
	            return ("Selvin Asencio");
	        case 7:
	            return ("Akylbek Cholurov");
	        case 8:
	            return ("Frank Hernandez");
	        case 9:
	            return ("Nurgazy Ibraimov");
	        case 10:
	            return ("Evelyn Vidaurre");
	        case 11:
	            return ("Anna Luchenkova");
	        case 12:
	            return ("Gulzhana Malikova");
	        case 13:
	            return ("Rocio Rodrigez");
	        case 14:
	            return ("Daniel Senzano");
	        case 15:
	            return ("Job Senzano");
	        default:
	            return ("Meerim Jumasheva");
	        }
	    }
	}