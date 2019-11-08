package day28;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormaterPractice {
	public static void main(String args[]) {
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formattedDate = f.format(today);
		System.out.println("MM/dd/YYYY : "+formattedDate);
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM.dd.YY");
		formattedDate = f1.format(today);
		System.out.println(formattedDate);
				
	}

}
