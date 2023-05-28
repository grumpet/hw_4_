package hw_4;
//1
public abstract class Account  {
	protected static int accountNumber;
	protected double balance;
	public Account(int accountNumber,double balance) {
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	//empty constructor for another empty constroctor in the banking system class
	public Account(){
	}
	
	
	public void withDraw(double ammount){
		this.balance-=ammount;
		
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
	public void setBalance(double balance){
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "account number: "+this.accountNumber+"\nbalance "+this.balance;
		
	}
	//override
	public boolean Equals(Account a, Account b){
		return a.getAccountNumber()==b.getAccountNumber();	
	}
	
	
	
	
	
	

}
