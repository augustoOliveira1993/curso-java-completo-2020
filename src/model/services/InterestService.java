package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greter than zero.");
		}
		return amount * Math.pow(1 + this.getInterestRate() / 100, months);
	}
}
