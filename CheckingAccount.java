//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw_4;

public class CheckingAccount extends Account implements Loanable{
	private double overdraftLimit;
	private double loanLimit;
	public CheckingAccount(int accountNumber, double balance,double overdraftLimit,double loanLimit) {
		super(accountNumber, balance);
		setOverdraftLimit(overdraftLimit);
		setLoanLimit(loanLimit);
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
	}
	public void setLoanLimit(double loanLimit) {
		this.loanLimit=loanLimit;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public double getLoanLimit() {
		return loanLimit;
	}
	
	@Override
	public void withDraw(double ammount){
		if(ammount > this.getMaxWithdraw()) {
			throw new Error("ammount is bigger than the max withdraw");
		}
		else {
			setBalance(super.getBalance()-ammount);
		}
	}
	
	@Override
	public String toString() {
		return "\naccount number "+super.accountNumber+"\nbalance"+super.balance +"\noverdraftLimit "+overdraftLimit+"\nloanLimit "+loanLimit;
	}
	

	
	public boolean applyLoan(double LoanAmmount) {
		if(LoanAmmount > this.getBalance()) {
			throw new Error("LoanAmmount is bigger than balance");
		}

		return true;
	}
	
	public double getMaxWithdraw(){
		return this.getBalance()+overdraftLimit+loanLimit;
	}
	

}
