package application.predicate;

import java.util.ArrayList;
import java.util.List;

import application.comparetor.entities.Product;
import application.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(Product::staticProductPredicate);// referencia para metodo
		
		for (Product p : list) {
			System.out.println(p);
		}
	

	}

}
