package application.generics2.entities;

public class Product implements Comparable<Product> {
	
	private String name;
	private Double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(", ");
		sb.append(String.format("%.2f", this.price));
		return sb.toString();
	}


	public int compareTo(Product outro) {
		return this.price.compareTo(outro.getPrice());
	}
}
