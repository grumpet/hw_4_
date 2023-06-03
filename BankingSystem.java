package hw_4;
import java.util.ArrayList;
public class BankingSystem extends Account implements InterestBearing {
ArrayList<Account> accounts;
	

	public BankingSystem(){
	super();
	this.accounts=new ArrayList<Account>();
	}
	
	public BankingSystem(int accountNumber, double balance) {
		super(accountNumber, balance);
		this.accounts=new ArrayList<Account>();
	}
	
	
	
	// adds account to the array list accounts
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	//returns interse from all of the bank accounts 
	public double computeInteresForAllAccounts(int years){
		//complete
		double sum = 0;
		for(Account a:accounts) {
			if(a.getClass()==SavingAccount.class) {
				sum+=a.getBalance()*INTEREST_RATE*years;
			}
			else if(a.getClass()==StudentSavingAccount.class) {
			}
		}
		return sum;	
	
	}
	
	// searches bank account 
	public Object search(int accountNumber) {
		for(Account a:accounts) {
			if(a.getAccountNumber()==accountNumber){
				return a;
			}
		}
		System.out.println("no account number found returns 0: ");
		return 0;
		
	}
	
	
	
	
	//prints bank accounts 
	public void  printAccounts() {
		for(Account a:accounts) {
			System.out.println(a.toString());
		}
	}

	@Override
	public double computeIntres(int years) {
		return years*INTEREST_RATE;
	}
	

}
