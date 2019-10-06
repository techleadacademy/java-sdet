package day15;

public class BankAccountDemo {
	public static void main(String[] args) {
		
		BankAccount johnAccount = new BankAccount(100.0,"John",false);		
		
		System.out.println(johnAccount); 
		
		System.out.println("After Deposit");
		johnAccount.depositMoney(200.0);		
		johnAccount.depositMoney(20.0);
		System.out.println(johnAccount);
		
		System.out.println("After Withdraw");
		johnAccount.withdraw(5000.0);
		System.out.println(johnAccount);
	}
}
