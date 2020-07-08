package entities.exefixacao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = scan.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name: ");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.print("Anual income: ");
				double rendaAnual = scan.nextDouble();
				System.out.print("Health expenditures: ");
				double gastoSaude = scan.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Name: ");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.print("Anual income: ");
				double rendaAnual = scan.nextDouble();
				System.out.print("Number of employees: ");
				int numeroFucionarios = scan.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroFucionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (Pessoa p : list) {
			System.out.printf("%s: $ %.2f\n", p.getNome(), p.calcularImporsto());
			sum += p.calcularImporsto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + sum);
		scan.close();
	}
}
