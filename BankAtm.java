package Session6;

import java.util.Scanner;

public class BankAtm {
	
	Scanner input = new Scanner(System.in);

	int atmID;
	String bankName;
	String location;
	double balance= 50000;
	String type;
	public BankAtm() {
		
	}
	
	 public BankAtm(double balance) {
		this.balance = balance;
	}
	
	void withdrawAmt(double amt) throws BankATMException{
		System.out.println("Your current balance is: " + balance);
	
		System.out.println("\nEnter another amount if you would like to withdraw more.");
		amt = input.nextDouble();
		balance = balance - amt;
		System.out.println("Your balance is now: " + balance);
		
		if((balance <= 10000) || amt > balance)  {
			throw new BankATMException("This balance value is NOT approved.");
		} else {
			System.out.println("You are eligible to keep withdrawing");
		}
		
		}
	
	
	void depositAmt(double amt) {
		System.out.println("Your current balance is: " + balance);
		System.out.println("\nHow much would you like to deposit?");
		amt = input.nextDouble();
		balance = balance + amt;
		System.out.println("Your balance is now: " + balance);

	}
}
	
	class BankATMException extends Exception {
		
		BankATMException(String msg) {
			super(msg);
		}
	}
