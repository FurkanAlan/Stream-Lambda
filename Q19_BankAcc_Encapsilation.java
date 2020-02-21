package Codes_InterviewQuestions;

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
interface AccountFactory1<F extends BankAccount1>{
	F create();
}
public class Q19_BankAcc_Encapsilation {
	public static void main(String[] args) {
		
	
	
	AccountFactory1<BankAccount1> accountFactory=BankAccount1::new;
	
	BankAccount1 jean=accountFactory.create();
    BankAccount1 michail=accountFactory.create();
    BankAccount1  mehmet=accountFactory.create();
    BankAccount1 levis=accountFactory.create();
      jean.setAccountHolder("Jean");
      jean.setAccountNumber(3564789999l);
      jean.deposit(300000);
      michail.setAccountHolder("Micheal");
      michail.setAccountNumber(7548548549l);
      michail.deposit(200000);
      mehmet.setAccountHolder("Mehmet");
      mehmet.setAccountNumber(56765465466547l);
      mehmet.deposit(120000);
      levis.setAccountHolder("Levis");
      levis.setAccountNumber(876765776570l);
      levis.deposit(320000);
      jean.withDraw(3000);
      michail.withDraw(290000);
      mehmet.withDraw(210000);
      levis.withDraw(20000);
      
      List<BankAccount1> accList=new ArrayList<>(Arrays.asList(jean,michail,mehmet,levis));
      
      accList.stream()
             .filter(x->x.getAvailableBalance()>200000)
             .forEach(x->x.getInfo());
	}

}

class BankAccount1{
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
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
	public void deposit(double amount) {
		AvailableBalance+=amount;
	}
	
	public void withDraw(double amount) {
		if(AvailableBalance<=0) {
			System.out.println("your account balance is less then ot equal to 0");
		}else if(AvailableBalance<0) {
			AvailableBalance-=35;
		}else {
			AvailableBalance-=amount;
		}
	}
	
	public void showBalance() {
		System.out.println("Available balance is "+AvailableBalance);
	}
	
	public void getInfo() {
		System.out.println("=================================");
		System.out.println("Account holder: "+AccountHolder+"\nAccount Number: "+AccountNumber+"\nAvaileble Balance :"+AvailableBalance);
	}
}