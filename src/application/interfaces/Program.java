package application.interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayoalService;

public class Program {
	
	public static Scanner scan;
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = scan.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(scan.next());
		System.out.print("Contract value: ");
		double totalValue = scan.nextDouble();
		
		Contract contract = new Contract(number, data, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = scan.nextInt();
		
		ContractService contractService = new ContractService(new PayoalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Installments:");
		for (Installment c : contract.getInstallments()) {
			System.out.println(c);
		}
		
		
		scan.close();
	}

}
