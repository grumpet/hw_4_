//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw_4;

public class StudentSavingAccount extends SavingAccount implements InterestBearing{

	private double encourageRate;
	public StudentSavingAccount(int accountNumber, double balance, double encourageRate) {
		super(accountNumber, balance);
		this.encourageRate=encourageRate;
	}
	public String toString() {
		return "\naccount number "+super.accountNumber+"\nbalance "+super.balance+ "\nencoragerate "+this.encourageRate;
	}
	@Override
	 public double computeIntres(int years) {
		 return super.getBalance()*(INTEREST_RATE+encourageRate)*years;
	 }
	

}
