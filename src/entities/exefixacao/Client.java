package entities.exefixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birdDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date birdDate) {
		this.name = name;
		this.email = email;
		this.birdDate = birdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirdDate() {
		return birdDate;
	}

	public void setBirdDate(Date birdDate) {
		this.birdDate = birdDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " ");
		sb.append("(" + sdf.format(this.birdDate) + ") - ");
		sb.append(this.email + "\n");
		return sb.toString();
	}
}
