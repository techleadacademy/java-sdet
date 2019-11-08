package day28;
import java.time.LocalDate;
import java.time.Month;

public class DatePractice {
	public static void main(String[] args) {
		
		//Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date: "+today);
		
		
		LocalDate birthDay = LocalDate.of(1996, Month.MARCH, 26);
		System.out.println("Birthday: "+birthDay);
		
		System.out.println("Day of Week: "+birthDay.getDayOfWeek());
		System.out.println("Is Leap Year: "+birthDay.isLeapYear());
		
		//Please check your birthday day of week
		System.out.println("ERA: "+birthDay.getEra());
		
		// Three month ahead
		LocalDate afterThreeMonth = birthDay.plusMonths(3);
		System.out.println("After Three month: "+afterThreeMonth);
		System.out.println("Day of week: "+afterThreeMonth.getDayOfWeek());
		
		LocalDate plusTwoWeeks = afterThreeMonth.plusWeeks(2);
		System.out.println("Plust two weeks: "+plusTwoWeeks);
		
		
		
		
		
	}
}
