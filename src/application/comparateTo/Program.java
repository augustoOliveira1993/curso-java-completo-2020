package application.comparateTo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import application.comparateTo.entities.Fucionario;

public class Program {

	public static void main(String[] args) {
		
		List<Fucionario> list = new ArrayList<>();
		String path = "C:\\temp\\init2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String fucionarioCsv = br.readLine();
			while (fucionarioCsv != null) {
				String[] filds = fucionarioCsv.split(",");
				list.add(new Fucionario(filds[0], Double.parseDouble(filds[1])));
				fucionarioCsv = br.readLine();
			}
			Collections.sort(list); // ordenando minha coleção
			for (Fucionario func : list) {
				System.out.println(func);
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
