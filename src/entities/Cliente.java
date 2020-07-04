package entities;

import java.util.Date;

public class Cliente {
	
	private String name;
	private String email;
	private Date birdDate;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String name, String email, Date birdDate) {
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
		return "Cliente [name=" + name + ", email=" + email + ", birdDate=" + birdDate + "]";
	}
}
