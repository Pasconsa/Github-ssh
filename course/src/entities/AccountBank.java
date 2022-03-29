package entities;

public class AccountBank {  //01
	
	private int  number;    //02
	private String  holder;
	private double  balance ;
	
	public AccountBank(int number, String holder) { //03
		
		this.number = number;
		this.holder = holder;
	
	}

	public AccountBank(int number, String holder, double initialDeposit) { //04  //08

		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //08
	}
	
	
	
	//05

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	

	//06
	public void deposit(double amount) {
		balance += amount;
	}
			
		
	//07
	public void withdraw (double amount) {
		balance -= amount + 5.0;
		
	}
	
	public String toString() {         //14
		return "Account"
				+ number
				+", Holder: "
				+holder
				+", Balance: $ "
				+ String.format("%.2f", balance);			
				
	}
	

}
