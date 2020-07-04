package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Exe04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Is there na initial deposit (Y/N)? ");
		char response = scan.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		} else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta.depositar(scan.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta.sacar(scan.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);
		
		scan.close();
	}

}
