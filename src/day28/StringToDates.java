package day28;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDates {
	public static void main(String[] args) {
		String winterOlympicsStr = "2002-02-08";
		
		LocalDate winterODate = LocalDate.parse(winterOlympicsStr);
		// That's we convert String to LocalDate(defaul value) 
		System.out.println("Default Format Date Parsing: "+winterODate);
		
		String summerOlypicsStr = "06/19/1996";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate summerODate = LocalDate.parse(summerOlypicsStr,f);
		System.out.println(summerODate);
		
		boolean isAfter = winterODate.isAfter(summerODate);
		System.out.println("Winter Oplym was after Summer Olymp: "+isAfter);
		
		
	}
}
