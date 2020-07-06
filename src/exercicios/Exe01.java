package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exe01 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle whidth and height: ");
		rectangle.height = scan.nextDouble();
		rectangle.width = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

	}

}
