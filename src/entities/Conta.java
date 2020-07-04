package entities;

public class Conta {
	
	private int numConta;
	private String name;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
	}
	
	public Conta(int numConta, String name, double saldoInicial) {
		this.numConta = numConta;
		this.name = name;
		this.depositar(saldoInicial);;
	}
	
	public void sacar(double valoSacar) {
		this.saldo -= valoSacar + 5.0;
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
		}
		
	}
	
	public int getNumConta() {
		return numConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Account "
				+ this.getNumConta()
				+ ", Holder: "
				+ this.getName()
				+ ", Balance: $ "
				+ String.format("%.2f", this.saldo);
	}
}
