package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a custom class for bankaccountThe attributes/data that the class can have are:
              AccountHolder, AccountNumber, AvailableBalance
    Actions the class can do are:deposit, withdraw, checking balance
    requiremnets:1. apply encapsulations
                 2. user should be able to deposit, withdraw and check the balance
           	    2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
 				    2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
*/
interface AccountFactory1<T extends BankAccount1>{
	T createAccount(String accHolder,long accNumber);
	
}

class BankAccount1{
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	
	
	
	public BankAccount1(String accountHolder, long accountNumber) {
		super();
		AccountHolder = accountHolder;
		AccountNumber = accountNumber;
		
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		AvailableBalance = availableBalance;
	}
	
	public void deposit(long amount) {
		AvailableBalance+=amount;
		
	}
	public void withdraw(long amount) {
		if(AvailableBalance<=0) {
			System.out.println("your account balance is not available");
		}else if(AvailableBalance<0) {
			AvailableBalance-=35;
		}else AvailableBalance-=amount;
		
		
		
		
	}
	
	public void showBalance() {
		System.out.println("Account Holder: "+AccountHolder+" Available balance "+AvailableBalance);
	}
	
	public String getinfo() {
		return "BankAccount AccountHolder=" + AccountHolder + ", AccountNumber= " + AccountNumber
				+ ", AvailableBalance=" + AvailableBalance ;
	}
	
	
}
public class Q19_BankAccount_Encapsilation {
	public static void main(String[] args) {
	AccountFactory1<BankAccount1> accountFactory=BankAccount1::new;
		
		BankAccount1 john=accountFactory.createAccount("John", 2345678917896543l),
		      mike=accountFactory.createAccount("Mike", 2345678917896590l);
		    
		   john.deposit(200000);
		   john.withdraw(201000);;
		   mike.deposit(20000);
		   mike.withdraw(20100);
		   
		   List<BankAccount1> accList=new ArrayList<>(Arrays.asList(john,mike));
		
		   accList.stream()
		   		  .forEach(x->x.showBalance());
		   accList.stream()
	   		  .forEach(x->System.out.println(x.getinfo()));
		   
	}

}
