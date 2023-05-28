package hw_4;

public class SavingAccount extends Account implements InterestBearing{

	public SavingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);

	}
	
	public double computeIntres(int years) {
		return years*INTEREST_RATE*super.getBalance();
	}
	
	
	public void withDraw(double ammount){
		if(super.getBalance()-ammount<0) {
			throw new Error("this withdraw will make the balance less thn zero");
		}
		else {
			setBalance(super.getBalance()-ammount);
		}
		
	}

}
