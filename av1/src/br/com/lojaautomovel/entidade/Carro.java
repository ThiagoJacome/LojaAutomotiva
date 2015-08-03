package br.com.lojaautomovel.entidade;

/*classe carro herda da classe veiculo*/
public class Carro extends Veiculo {	
	
		String cambio;
		float motorizacao;
	
		public Carro(String chassi, String montadora, String modelo, String cor, float preco, String cambio, float motorizacao) {
			super(chassi, montadora, modelo, cor, preco);
			super.setChassi(chassi);
			super.setMontadora(montadora);
			super.setModelo(modelo);
			super.setCor(cor);
			super.setPreco(preco);
			this.cambio = cambio;
			this.motorizacao = motorizacao;
		}
	//get e set cambio
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	//get e set motorizacao
	public float getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

}

