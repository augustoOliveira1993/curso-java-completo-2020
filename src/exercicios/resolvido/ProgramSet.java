package exercicios.resolvido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();// ler a proxima linha
			}
			int cont = 1;
			for (LogEntry le : set) {
				System.out.println(cont + " - " + le.getUsername());
				cont++;
			}
			System.out.println("Total users: " + set.size());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scan.close();
	}

}
