package day8;

import java.util.Random;

public class MyMoney {
    public static void main(String[] args) {
		Random gen = new Random();
		int balance = gen.nextInt();
		
		if(balance > 0) {
			System.out.println("your balance is \"Positive\" : $"+balance);
		}else if(balance < 0) {
			System.out.println("your balance is \"Negative\" : $"+balance);
		}else {
			System.out.println("Zero balance : $"+balance);
		}
	}
}
