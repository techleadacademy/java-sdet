package day28;

import java.time.LocalDate;
import java.time.Period;

public class PeriodPr {
	public static void main(String[] args) {
		Period p1 = Period.of(2, 1, 0);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate todayPlusP = today.plus(p1);
		System.out.println(todayPlusP);
	}
}
