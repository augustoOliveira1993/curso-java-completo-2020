package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = scan.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
		
		scan.close();

	}

}
