package Codes_InterviewQuestions.first;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface AccountFactory<T extends BankAccount>{
	T createAccount(String accHolder,long accNumber);
}
class BankAccount{
	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String AccountHolder,long AccountNumber) {
		this.AccountHolder=AccountHolder;
		this.AccountNumber=AccountNumber;
		
	}
   public void showBalance() {
	   System.out.println("==========================");
	   String accNum=""+AccountNumber;
	   String accountNumber="************"+accNum.substring(12);
	   System.out.println("Account Holder : "+AccountHolder);
	   System.out.println("Account Number: "+accountNumber);
	   System.out.println("Available Balance"+Balance);
	   System.out.println("===========================");
   }
   
   public void deposit(long amount) {
	   
	   
	   Balance+=amount;
	   
	   
   }
   
   public void withDraw(long amount) {
	   
	   if(Balance<=0) {
		   System.out.println("No available Balance..");
		   return;
	   }
	   
	   Balance-=amount;
	   if(amount>Balance) {
		   Balance-=35;
	   }
	   
   }
	
}

public class Q17_BankAccunt {
	
	public static void main(String[] args) {
		AccountFactory<BankAccount> accountFactory=BankAccount::new;
		BankAccount ahmet=accountFactory.createAccount("Ahmet Kose", 8736598027497380L),
				    mehmet=accountFactory.createAccount("Mehmet Emin", 87365980274972134l),
					huseyin=accountFactory.createAccount("Huseyin Kadri", 87365980274975329l);
		
		
		List<BankAccount> accList=new ArrayList<>(Arrays.asList(ahmet,mehmet,huseyin));
		
		ahmet.deposit(20000000);
		ahmet.withDraw(20000001);
		mehmet.deposit(4000000);
		mehmet.withDraw(40000);
		huseyin.deposit(300000);
		huseyin.withDraw(100000000);
		
		accList.stream().forEach(x->x.showBalance());
					
		
	}

}
