package entities.exefixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = scan.nextInt();
		for (int i=0; i<n; i++) {
			a.add(scan.nextInt());
		}

		System.out.print("How many students for course B? ");
		n = scan.nextInt();
		for (int i=0; i<n; i++) {
			b.add(scan.nextInt());
		}
		
		System.out.print("How many students for course c? ");
		n = scan.nextInt();
		for (int i=0; i<n; i++) {
			c.add(scan.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
	}

}
