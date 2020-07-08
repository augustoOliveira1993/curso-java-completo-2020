package application.abstracts;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	// atualizar saldo com taxa de juros
	public void updateBalance() {
		this.balance += this.balance * this.interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
