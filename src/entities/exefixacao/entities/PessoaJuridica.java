package entities.exefixacao.entities;

public class PessoaJuridica extends Pessoa{
	
	private int numeroFucionario;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFucionario) {
		super(nome, rendaAnual);
		this.numeroFucionario = numeroFucionario;
	}

	public int getNumeroFucionario() {
		return numeroFucionario;
	}

	public void setNumeroFucionario(int numeroFucionario) {
		this.numeroFucionario = numeroFucionario;
	}

	@Override
	public Double calcularImporsto() {
		int imposto = 0;
		if (this.numeroFucionario > 10) {
			imposto = 14;
		}else {
			imposto = 16;
		}
		return this.rendaAnual * imposto / 100;
	}
}
