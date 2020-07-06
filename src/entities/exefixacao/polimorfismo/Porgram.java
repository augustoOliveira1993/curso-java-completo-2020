package entities.exefixacao.polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porgram {
	
	public static Scanner scan;

	public static void main(String[] args) throws ParseException {
		
		scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> lista = new ArrayList<>();
		
		System.out.print("Enter the number products: ");
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			if (op == 'i') {
				System.out.print("Customs fee: ");
				double customFee = scan.nextDouble();
				Product prodCF = new ImportedProduct(name, price, customFee);
				lista.add(prodCF);
			}else if (op == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				scan.nextLine();
				String manufactureDate = scan.nextLine();
				Product prodUsed = new UsedProduct(name, price, sdf.parse(manufactureDate));
				lista.add(prodUsed);
			} else {
				Product prod = new Product(name, price);
				lista.add(prod);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : lista) {
			System.out.println(p.priceTag());
		}
	}

}
