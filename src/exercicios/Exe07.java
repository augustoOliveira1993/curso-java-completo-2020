package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Exe07 {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		
		Estudante[] student = new Estudante[10];
		int n = 0;
		
		System.out.print("How many rooms will be rented? ");
		n = scan.nextInt();
		
		
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.printf("Rendt #%d%n", i+1);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			student[room] = new Estudante(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<student.length; i++) {
			if (student[i] != null) {
				System.out.printf("%d: %s, %s\n", student[i].getRoom(), student[i].getName(), student[i].getEmail());
			}
			
		}
	}

}
