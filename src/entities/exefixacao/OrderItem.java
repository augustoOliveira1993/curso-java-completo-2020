package entities.exefixacao;

public class OrderItem{
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {

	}
	
	public double subTotal() {
		return this.quantity * this.price;
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
		sb.append(this.product.getName());
		sb.append(", $" + this.product.getPrice());
		sb.append(", Quantity: ");
		sb.append(this.quantity);
		sb.append(", Subtotal: $");
		sb.append(this.subTotal() + "\n");
		return sb.toString();
	}
}
