package hw_4;

public class StudentSavingAccount extends SavingAccount implements InterestBearing{

	private double encourageRate;
	public StudentSavingAccount(int accountNumber, double balance, double encourageRate) {
		super(accountNumber, balance);
		this.encourageRate=encourageRate;
	}
	public String toString() {
		return super.toString()+" encourageRate "+encourageRate;
	}
	 public double computeInterest(int years) {
		 return super.getBalance()*(INTEREST_RATE+encourageRate)*years;
	 }
	

}
