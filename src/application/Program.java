package application;

import java.util.Scanner;

import entities.Bank;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accountHolderName = sc.nextLine();
		sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char decision = sc.nextLine().charAt(0);
		
		Bank bank = new Bank(accountNumber, accountHolderName);
		
		if (decision == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			
			bank = new Bank(accountNumber, accountHolderName, initialDepositValue);
			bank.setDeposit(initialDepositValue);
			
			System.out.println("Account data:");
			System.out.printf("Account %d, Holder: %s, Balance: %.2f", accountNumber, accountHolderName, bank.getDeposit());
			
			char depositMore;
			do {
				System.out.print("Do you want to deposit another value? (y/n): ");
				depositMore = sc.nextLine().charAt(0);
				
				if (depositMore == 'y') {
					System.out.print("Enter deposit value: ");
					double additionalDeposit = sc.nextDouble();
					sc.nextLine();
					
					bank.setDeposit(bank.getDeposit() + additionalDeposit);
					
					System.out.println("Deposit sucessfull!");
				}
			} while (depositMore == 'y');
		} 
		
		sc.close();
		
	}
}
