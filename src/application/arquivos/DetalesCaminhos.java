package application.arquivos;

import java.io.File;
import java.util.Scanner;

public class DetalesCaminhos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a file path:");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		scan.close();
	}

}
