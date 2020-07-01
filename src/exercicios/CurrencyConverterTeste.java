package exercicios;

import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterTeste {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double doolarPrince = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double qtdDollar = scan.nextDouble();
		
		double result = CurrencyConverter.converterReal(doolarPrince, qtdDollar); 
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		

	}

}
