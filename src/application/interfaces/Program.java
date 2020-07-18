package application.interfaces;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = scan.nextInt();
		

	}

}
