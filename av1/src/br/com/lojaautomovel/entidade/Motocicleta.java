/**
 * 
 */
package br.com.lojaautomovel.entidade;

/**
 * @author Thiago
 * @author Alessandra
 * @author Mariana
 * @version 1.0
 *
 */
public class Motocicleta extends Veiculo {

	private int cilindrada;
	private int capacidadeDoTanque;
	
	public Motocicleta(String chassi, String montadora, String modelo, String cor, float preco, int cilindrada, int capacidadeDoTanque) {
		super(chassi, montadora, modelo, cor, preco);
		super.setChassi(chassi);
		super.setMontadora(montadora);
		super.setModelo(modelo);
		super.setCor(cor);
		super.setPreco(preco);
		this.cilindrada = cilindrada;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
		
	//get e set cilindrada
		public int getCilindrada() {
			return cilindrada;
		}
		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}
		
		//get e set capacidadeDoTanque
		public int getCapacidadeDoTanque() {
			return capacidadeDoTanque;
		}
		public void setCapacidadeDoTanque(int capacidadeDoTanque) {
			this.capacidadeDoTanque = capacidadeDoTanque;
		}
	

}
