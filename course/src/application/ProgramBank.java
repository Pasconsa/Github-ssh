package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountBank;          //12

public class ProgramBank {                  //09

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);        //10
		Scanner sc = new Scanner(System.in); //10
		AccountBank  account;                  //12
		
		
		System.out.print("Enter account  number: "); //11
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: "); //11
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");  //12
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountBank(number, holder, initialDeposit);
		}
		else {
			account = new AccountBank(number, holder);
		}
		
		System.out.println();                        //13
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println();                          //15
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();                         //16
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		sc.close();
	}

}
