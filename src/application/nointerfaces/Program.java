package application.nointerfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTazService;
import model.services.RentalService;

public class Program {

	public static Scanner scan;
	public static SimpleDateFormat sdf;
	
	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.print("Car Model: ");
		String carModel = scan.nextLine();
		System.out.print("Pichup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(scan.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(scan.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = scan.nextDouble();
		System.out.print("Enter price per Day: ");
		double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTazService());
		
		rentalService.processinInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		scan.close();
		
	}
}
