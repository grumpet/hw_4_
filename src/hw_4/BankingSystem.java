package hw_4;
import java.util.ArrayList;
public class BankingSystem extends Account implements InterestBearing {
ArrayList<Account> accounts;
	
	public BankingSystem(int accountNumber, double balance) {
		super(accountNumber, balance);
		this.accounts=new ArrayList<Account>();
	}
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	public double computeInteresForAllAccounts(int years){
		double sum = 0;
		for(Account a:accounts) {
			sum+=a.getBalance()*INTEREST_RATE;
		}
		return sum;	
	
	}
	
	//
	public Object search(int accountNumber) {
		for(Account a:accounts) {
			if(a.getAccountNumber()==accountNumber){
				return a;
			}
		}
		System.out.println("no account number found returns 0: ");
		return 0;
		
	}
	
	@Override
	public double computeIntres(int years) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//prints bank accounts 
	public void  printAccounts() {
		for(Account a:accounts) {
			System.out.println(a.toString());
		}
	}
	

}
