package entities.exefixacao.polimorfismo;

public class Product {
	
	protected String name;
	protected Double price;
	
	public Product() {
		
	}

	public Product(String name, Double price) {
		super();
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
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" $ ");
		sb.append(this.price);
		return sb.toString();
	}
}
