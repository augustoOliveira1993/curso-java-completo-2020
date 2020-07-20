package application.maps.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> urnas = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if (urnas.containsKey(name)) {
					int votoSoFor = urnas.get(name);
					urnas.put(name, votos + votoSoFor);
				} else {
					urnas.put(name, votos);
				}
				
				line = br.readLine();
			}
			
			for (String key : urnas.keySet()) {
				System.out.println(key + ": " + urnas.get(key));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scan.close();

	}

}
