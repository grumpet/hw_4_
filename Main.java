package hw_4;

public class Main {

	public static void main(String[] args) {
		BankingSystem bank  = new BankingSystem();
		CheckingAccount checking1 = new CheckingAccount(1,1000,500,10000);
		CheckingAccount checking2 = new CheckingAccount(2,2000,700,20000);
		SavingAccount saving1= new SavingAccount(3,3000);
		StudentSavingAccount studentSaving1= new StudentSavingAccount(4,4000,0.01);
		bank.addAccount(checking1);
		bank.addAccount(checking2);
		bank.addAccount(saving1);
		bank.addAccount(studentSaving1);
		bank.printAccounts();
		if(checking1.getClass()==CheckingAccount.class) {
			System.out.println("\nmax withdraw "+checking1.getMaxWithdraw()); 
		}
		System.out.println("\ninteres "+bank.computeInteresForAllAccounts(2));
		System.out.println("\nbalances");
		for(Account a:bank.accounts) {
			System.out.println(a.getBalance());
		}
		
		
	}

}
