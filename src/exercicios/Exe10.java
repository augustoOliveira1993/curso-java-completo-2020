package exercicios;

import java.util.Scanner;

public class Exe10 {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] mat = new int[n][m];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		int x = scan.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.printf("Position %d, %d%n", i, j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Rigth: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("down: " + mat[i+1][j]);
					}
					
				}
					
			}
		}
	}

}
