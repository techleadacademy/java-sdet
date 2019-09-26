package practice;

import java.util.Scanner;

public class teller {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
//		sc.nextInt();
		
		//create Object of name: accounts
		accounts acc= new accounts();
		acc.checking="everydayChecking";
		acc.savings="way2save";
		acc.openSaving("alex");
		
		//Create an object with name Loans
		Loans loan= new Loans();
		loan.mortgage="mortgage";
		loan.personalLoan="Ploan";
		
		

		
		teller aa = new teller();
		System.out.println(aa.see("redxx"));

		
	}
	public String see(String str) {
		if( str.length()>= 3 && str.substring(0,3).equals("red")) {
			return "red";
			
		}else {
			return "empty";
		}
	}

}
