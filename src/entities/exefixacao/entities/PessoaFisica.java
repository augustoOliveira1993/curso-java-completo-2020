package entities.exefixacao.entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calcularImporsto() {
		int imposto = 0;
		if (this.rendaAnual <= 20000.0) {
			imposto = 15;
		}else {
			imposto = 25;
		}
		if (this.gastoSaude > 0) {
			return (this.rendaAnual * imposto / 100) - (this.gastoSaude * 50 / 100);
		}
		return this.rendaAnual * imposto / 100;
	}
}
