package hw_4;
//1
public abstract class Account  {
	private static int accountNumber;
	private double balance;
	public Account(int accountNumber,double balance) {
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	public void withDraw(double ammount){
		//this.balance-=ammount;
		
	}
	public void deposite(double ammount){
		this.balance+=ammount;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public double getBalance() {
		return this.balance;
	}
	@Override
	public String toString() {
		return "account number: "+this.accountNumber+"\nbalance "+this.balance;
		
	}
	//override
	public boolean equals(Account a, Account b){
		return a.getAccountNumber()==b.getAccountNumber();	
	}
	
	
	
	
	
	

}
