package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exe08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Funcionario> func = new ArrayList<>();
		
		System.out.print("How many emploees will be registred? ");
		int n = scan.nextInt();
		
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Emplyee #%d%n", i+1);
			System.out.print("Id: ");
			int id = scan.nextInt();
			while(hasId(func, id)) {
				System.out.println("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			func.add(new Funcionario(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the emploee id that will have salary increase: ");
		int id = scan.nextInt();
		Funcionario emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the porcentage: ");
			double porcent = scan.nextDouble();
			emp.aumentaSalary(porcent);
		}
		
		System.out.println();
		System.out.println("List of emploees: ");
		for (Funcionario f : func) {
			System.out.println(f);
		}
		scan.close();
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
