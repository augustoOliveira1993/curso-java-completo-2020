package application.defaultmethods;

import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();

		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " Months:");
		System.out.println(String.format("%.2f", payment));

		scan.close();
	}

}
