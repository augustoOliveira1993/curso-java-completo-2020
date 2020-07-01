package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProductV3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name:");
		String name = scan.nextLine();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be remover from stock: ");
		quantity = scan.nextInt();
		product.removerProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		scan.close();

	}

}
