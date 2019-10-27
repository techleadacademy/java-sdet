package day25;

import java.util.Scanner;

public class Assignnment7 {
	public static void main(String[] args) {
		String[] month = new String[12];
		month[0] = "Jan";
		month[1] = "Feb";
		month[2] = "Mar";
		month[3] = "Apr";
		month[4] = "May";
		month[5] = "June";
		month[6] = "July";
		month[7] = "Aug";
		month[8] = "Sep";
		month[9] = "Oct";
		month[10] = "Nov";
		month[11] = "Dec";
		
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean flag = true;
		while(flag) {
			System.out.println("Enter you month number: ");
			int userInputMonth = sc.nextInt();
			try {
				
				System.out.println(month[userInputMonth - 1]);
				flag = false;
			}catch(Exception e){
				
				System.out.println("Wrong month number: 1 - 12");
				flag = true;
			}
		}
		
	}
}
