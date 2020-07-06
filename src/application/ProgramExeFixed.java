package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities.exefixacao.Client;
import entities.exefixacao.Order;
import entities.exefixacao.OrderItem;
import entities.exefixacao.Product;

public class ProgramExeFixed {

	private static Scanner scan;

	public static void main(String[] args) throws ParseException {
		
		scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Order o = new Order();
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameCliente = scan.nextLine();
		System.out.print("Email: ");
		String emailCliente = scan.nextLine();
		System.out.print("Bird date (DD/MM/YYYY): ");
		Date birdData = sdf.parse(scan.nextLine());
		Client cli = new Client(nameCliente, emailCliente, birdData);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusOrder = scan.nextLine();
		
		System.out.print("How many items to this order? ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			scan.nextLine();
			String nameProd = scan.nextLine();
			System.out.print("Product price: ");
			double priceProd = scan.nextDouble();
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			Product p = new Product(nameProd, priceProd);
			OrderItem oi = new OrderItem(quantity, priceProd, p);
			o.addItem(oi);
			
		}
		o.setClient(cli);
		String dataAtual = sdf1.format(new Date());
		o.setMoment(sdf1.parse(dataAtual));
		o.setStatus(OrderStatus.valueOf(statusOrder));
		
		System.out.println();
		System.out.println(o);
	}

}
