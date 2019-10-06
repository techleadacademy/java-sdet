package day15;

public class BankAccount {
	private double balance;
	private String holderName;
	private boolean isTerminated;
	
	
	
	public BankAccount() {
		
	}
	
	public BankAccount(double initBalance, String initHolderName, boolean initIsTerminated) {
		if(initBalance >= 100.0) {
			this.balance = initBalance;
			this.holderName = initHolderName;
			this.isTerminated = initIsTerminated;
		}else {
			System.out.println("Sorry, the minimum initial balance is $100.0");
		}

	}
	
	public BankAccount(double initBalance, String holderName) {
		this.balance = initBalance;
		this.holderName = holderName;
	}
	
	public String toString() {
		return holderName+" "+balance+" "+isTerminated;		
	}
	

	
	public void depositMoney(double money) {
		this.balance += money;
	}
	
	// withdraw
	// void
	// double
	public void withdraw(double money) {
		if(money >= this.balance) {
			System.out.println(money+": OUT OF BALANCE");
		}else {
			this.balance =  this.balance - money;
		}
	}
	// BREAK till 11
	
	
}
