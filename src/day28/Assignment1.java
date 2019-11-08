package day28;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Assignment1 {
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		// YYYY-MM-dd
		// MM/dd/YYYY
		System.out.println("=== 1 ===");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
		String fDate = formatter.format(currentDate);
		System.out.println(fDate);
		
		System.out.println("=== 2 ===");
		LocalDate fourMonthAndTwoWeeks = currentDate.plusMonths(4).plusWeeks(2);
		System.out.println(formatter.format(fourMonthAndTwoWeeks));
		System.out.println("Day of Week will be "+fourMonthAndTwoWeeks.getDayOfWeek());
		
		System.out.println("=== 3 ===");
		LocalDate twoMonthAndTwoWeeksAgo = currentDate.minusMonths(2).minusWeeks(2);
		System.out.println(twoMonthAndTwoWeeksAgo);
		System.out.println(twoMonthAndTwoWeeksAgo.getDayOfWeek());
		System.out.println(twoMonthAndTwoWeeksAgo.getMonth());
		
		System.out.println("=== 4 ===");
		LocalDate startDate = LocalDate.of(2019, Month.AUGUST, 24);
		System.out.println(startDate);
		System.out.println(startDate.getDayOfWeek());
	}
}
