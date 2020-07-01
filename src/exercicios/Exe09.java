package exercicios;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) { // linhas
			for (int j=0; j<mat[i].length; j++) { // colunas
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) { // linhas
			for (int j=0; j<mat[i].length; j++) { // colunas
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative number = " + count);
		
		scan.close();

	}

}
