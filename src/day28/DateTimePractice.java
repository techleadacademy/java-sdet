package day28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
	
		//Print this date time in any other format:
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY - HH:mm");
		System.out.println(now.format(formatter));
		
		Period p1 = Period.of(2, 1, 0);
		LocalDateTime date1 = LocalDateTime.of(2019, 05, 05,12,00,00);
		System.out.println(date1.plus(p1));
		//date1.plusHours(5);
	}	
}
