//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw_4;
import java.util.ArrayList;
public class BankingSystem  {
ArrayList<Account> accounts;
	
	//empty constructor
	public BankingSystem(){
		this.accounts=new ArrayList<Account>();
	}

	
	
	// adds account to the array list accounts
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	//returns interse from all of the bank accounts 
	public double computeInteresForAllAccounts(int years){
	
		double sum = 0;
		for (Account account : accounts) {
			if (account instanceof InterestBearing) {
				sum += ((InterestBearing) account).computeIntres(2);
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

	

}
