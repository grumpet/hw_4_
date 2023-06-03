//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw_4;

public abstract class Account  {
	protected int accountNumber;
	protected double balance;
	public Account(int accountNumber,double balance) {
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	//empty constructor for another empty constroctor in the banking system class
	public Account(){
	}
	
	//each account has its own withdraw method
	public abstract void withDraw(double amount);
	
	
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
		return "\naccount number: "+this.accountNumber+"\nbalance "+this.balance;
		
	}
	//override
	public boolean Equals(Account a, Account b){
		return a.getAccountNumber()==b.getAccountNumber();	
	}
	
	
	
	
	
	

}
