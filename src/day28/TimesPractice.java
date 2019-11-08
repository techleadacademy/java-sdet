package day28;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimesPractice {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("TIME: "+now);
		
		LocalTime after1hour = now.plusHours(1).plusSeconds(120);
		System.out.println("TIME: "+after1hour);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("Formatted Time: "+formatter.format(now));	
		
		
	}
}
