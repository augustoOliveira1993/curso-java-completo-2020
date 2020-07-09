package model.entities;

import model.exceptions.LimitedBalanceException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			throw new LimitedBalanceException("Saldo é menor que zero ou é zero.");
		}
	}
	
	public void withdraw(Double amount) {
		if (amount > this.withdrawLimit) {
			throw new LimitedBalanceException("The amount exceeds withdraw limit");
		} else if (amount > this.balance) {
			throw new LimitedBalanceException("Not enough balance");
		} else if (amount < 0){
			throw new LimitedBalanceException("O valor a sacar tem que ser maior que zero.");
		} else {
			this.balance -= amount;
		}
	}
}
