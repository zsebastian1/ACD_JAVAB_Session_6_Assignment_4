package Session6;

import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//int balance = 1000;

		BankAtm ba = new BankAtm(); 
		BankAtm ba2 = new BankAtm();
		BankAtm ba3 = new BankAtm();

		String decision;
		while(true) {
			System.out.println("Hello, welcome to WeNeedYourMoney Bank! \nEnter W for a withdrawl, D, for a deposit, or L for leaving the application!");
			decision = input.next();
			if(decision.equalsIgnoreCase("W")) {
				try {

					ba.withdrawAmt(90);

					//.withdrawAmt(90);
				}catch(BankATMException e) {
					System.out.println(e);
				}
			}
				else if (decision.equalsIgnoreCase("D")){
					ba.depositAmt(100);
				}
				else if (decision.equalsIgnoreCase("L")) {
					System.out.println("You will now be leaving the application. Good bye!");
					System.exit(0);


					//.withdrawAmt(100);
					//.withdrawAmt(9999);
					//	System.out.println("Your balance is now: " + balance);
				}
			}

		}
	}

