package exercicios.exception;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.LimitedBalanceException;

public class ProgramException {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Holder: ");
			scan.nextLine();
			String holder = scan.nextLine();
			System.out.print("Initial balance: ");
			double balance = scan.nextDouble();
			System.out.print("Widthraw limit: ");
			double widthrawLimit = scan.nextDouble();
			Account acc = new Account(number, holder, balance, widthrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for widthraw: ");
			double amount = scan.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		}
		catch (LimitedBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Aconteceu um error inesperado");
		}
	}

}
