package application.abstracts;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> lista = new ArrayList<>();
		
		lista.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		lista.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		lista.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		lista.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double soma = 0;
		for (Account acc : lista) {
			soma += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", soma);
		
		for (Account acc : lista) {
			acc.deposit(10.0);
		}
		
		for (Account acc : lista) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
