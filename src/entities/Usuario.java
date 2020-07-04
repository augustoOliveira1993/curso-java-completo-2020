package entities;

public class Usuario {
	
	private String nome;
	private double salario;
	private int numFilhos;
	
	public Usuario() {
		this("", 0.0, 0);
	}

	public Usuario(String nome, double salario, int numFilhos) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.numFilhos = numFilhos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}

	@Override
	public String toString() {
		return this.nome
				+ ", "
				+ String.format("%.2f", this.salario)
				+ ", " + this.numFilhos;
	}
}
