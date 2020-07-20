package application.consumer;

import java.util.ArrayList;
import java.util.List;

import application.comparetor.entities.Product;
import application.consumer.util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(System.out::println);
	}

}
