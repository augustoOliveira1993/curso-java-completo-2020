package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exe03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		student.name = scan.nextLine();
		student.nota1 = scan.nextDouble();
		student.nota2 = scan.nextDouble();
		student.nota3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.mediaFinal());
		student.avaliarAluno();

	}

}
