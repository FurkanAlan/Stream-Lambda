package Codes_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 create a custom class for BankAccount attributes/data that can have are:1.  AccountHolder, 2. AccountNumber, 3. Balance
   Actions: deposit, withdraw, showBalance
      requiremnts:
      1.user should be able to deposit money into their account 
      2.user should be able to withdraw money from their account
        2.1. if the withdrawing account is greater than available balance, 35$ penalty charge will be added
        2.2. if the balance is less than or equal to 0, user should not be able to withdraw money
      3.user should be able to see their balance
 */
interface AccountFactory<P extends BankAccount>{
	P create(String accHolder,long accNumber);
}
public class Q17_BankAccount {
	public static void main(String[] args) {
		BankAccount ahmet=new BankAccount("Ahmet",8796543234567897L);
					ahmet.Deposit(200000);
					ahmet.showBalance();
					
					
					AccountFactory<BankAccount> accountFactory=BankAccount::new;
		            BankAccount umit=accountFactory.create("Umit", 9807650345267890L),
		            		    suad=accountFactory.create("Suad", 2345690127890976L);
		            umit.Deposit(300000);
		            suad.Deposit(450000);
		            BankAccount jean=accountFactory.create("Jean", 9845678902209890L);
		            BankAccount michail=accountFactory.create("Michail", 9845678997209891L);
		            BankAccount  mehmet=accountFactory.create("Mehmet", 9845680902209899L);
		            
		            List<BankAccount> accList=new ArrayList<>
		            				(Arrays.asList(jean,michail,mehmet,umit,suad));
		            
		            jean.Deposit(400000);
		            michail.Deposit(100000);
		            mehmet.Deposit(30000);
		            
		            accList.stream()
		                   .filter(x->x.AccountHolder.startsWith("M"))
		                   .forEach(x->x.showBalance());

	}
	
	

}
class BankAccount{
	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	public BankAccount() {
		
	}
	public BankAccount(String AccountHolder, long AccountNumber) {
		super();
		
		this.AccountHolder = AccountHolder;
		this.AccountNumber = AccountNumber;
		
		
	}
	
	
	public void showBalance() {
		System.out.println("=================================");
		String accountNumber=""+AccountNumber;
		String AccountNumber="************"+accountNumber.substring(12);
		System.out.println("Account Holder: "+AccountHolder);
		System.out.println("Account Number: "+AccountNumber);
		System.out.println("Available balance: "+Balance);
		System.out.println("=================================");
		
	}
	public void Deposit(double amount) {
		System.out.println("=================================");
		String acc=""+AccountNumber;
		String AccountNumber="************"+acc.substring(12);
		
		System.out.println("Depositing $"+amount+"to the account "+AccountNumber);
		Balance+=amount;
		System.out.println("New Balance: "+Balance);
		System.out.println("=================================");
	}
	
	public void WithDraw(double amount) {
		System.out.println("=================================");
		if(Balance<=0) {
			System.out.println("There is no availeble balance");
			return;
		}
		String acc=""+AccountNumber;
		String AccountNumber="************"+acc.substring(12);
		System.out.println("Withdrawing $"+amount+" from the account "+AccountNumber);
		Balance-=amount;
		if(Balance<0) {
			Balance-=35;
		}
		System.out.println("New balance $"+Balance);
		System.out.println("=================================");
		
	}

	

	public void setAccount(String accounHolder,long accountNumber) {
		AccountHolder = accounHolder;
		AccountNumber = accountNumber;
	}

	
	
	
}