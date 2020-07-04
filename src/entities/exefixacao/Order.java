package entities.exefixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem oi : this.items) {
			sum += oi.subTotal();
		}
		return sum;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append("Order status: ");
		sb.append(this.status.toString() + "\n");
		sb.append("Cleint: ");
		sb.append(this.client);
		sb.append("Order Items: \n");
		for(OrderItem oi : this.items) {
			System.out.println(oi.getPrice());
			System.out.println("ELE");
		}
		sb.append("Total price: $");
		sb.append(this.total());
		return sb.toString();
	}	
}
