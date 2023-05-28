package hw_4;

public class CheckingAccount extends Account implements Loanable{
	private double overdraftLimit;
	private double loanLimit;
	public CheckingAccount(int accountNumber, double balance) {
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
	public String toString() {
		return super.toString()+" overdraftLimit "+overdraftLimit+" loanLimit "+loanLimit;
	}
	

	
	public boolean applyLoan(double LoanAmmount) {
		if(LoanAmmount > this.getBalance()) {
			throw new Error("LoanAmmount is bigger than balance");
		}

		return true;
	}
	
	/*public double getMaxWithdraw(){
		
	}*/
	

}
