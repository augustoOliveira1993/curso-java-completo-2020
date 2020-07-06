package exercicios.resolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.print("Enter the nuber of employees: ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char op = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = scan.nextDouble();
			if (op == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				Employee empOut = new OutsourcedEmployee(name, hours, valueHour, additionalCharge);
				lista.add(empOut);
			} else if (op == 'n') {
				Employee emp = new Employee(name, hours, valueHour);
				lista.add(emp);
			} else {
				System.out.println("Opção Invalida!");
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee emp : lista) {
			System.out.println(emp.getName() + ", $" + String.format("%.2f", emp.payment()));
		}
		scan.close();
	}

}
