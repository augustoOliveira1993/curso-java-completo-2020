package exercicios.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Product> prod = new ArrayList<>();
	
		System.out.println("Enter file path: ");
		String sourceFileStr = scan.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String souceFolderStr = sourceFile.getParent();
		
		boolean success = new File(souceFolderStr + "\\out").mkdir();
		
		String targetFileStr = souceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				prod.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter  bw = new BufferedWriter (new FileWriter(targetFileStr))) {
				
					for (Product item : prod) {
						bw.write(item.getName() + "," + String.format("%.2f", item.totalValueInStock()));
						bw.newLine();
					}

				System.out.println(targetFileStr + " CREATED!");
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) { 
			System.out.println("Error: " + e.getMessage());
		}
	
	}

}
