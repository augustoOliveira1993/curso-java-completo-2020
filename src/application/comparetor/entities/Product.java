package application.comparetor.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticUpperCaserName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public void nonStaticPriceUpdate() {
		this.price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + String.format("%.2f", price);
	}
}
