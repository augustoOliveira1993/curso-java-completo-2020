package entities.exefixacao.polimorfismo;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" $ ");
		sb.append(this.totPrice());
		sb.append(String.format(" (Customs fee: $ %.2f)", this.customFee));
		return sb.toString();
	}
	
	public Double totPrice() {
		return this.price + this.customFee;
	}
}
