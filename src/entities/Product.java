package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		this("", 0.0, 0);
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removerProducts(int quantity) {
		this.quantity -= quantity;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return this.name
				+ ", $ " +
				String.format("%.2f", this.price) +
				", " +
				this.quantity +
				" units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
		
	}
}
