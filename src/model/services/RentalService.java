package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public void processinInvoice(CarRental carRenal) {
		long t1 = carRenal.getStart().getTime();
		long t2 = carRenal.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * this.pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * this.pricePerDay;
		}
		
		double tax = this.taxService.tax(basicPayment);
		
		carRenal.setInvoice(new Invoice(basicPayment, tax));
	}
}
