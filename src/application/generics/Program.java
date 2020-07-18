package application.generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PrintService<Double> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			Double value = scan.nextDouble();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		scan.close();
	}

}
