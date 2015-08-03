package br.com.lojaautomovel.entidade;

import java.security.InvalidParameterException;

/* Classe abstrata Veiculo com os atributos em comum das classes Carro e Motocicleta*/
abstract class Veiculo {
	
	private String chassi;
	
	private String montadora;
	
	private String modelo;
	
	private String cor;
	
	private float preco;
	
	/*Construtor passando os parametros(chassi,montadora, modelo, cor, preco)*/
	public Veiculo(String chassi, String montadora, String modelo, String cor, float preco){
		
		if (chassi == null)
			throw new NullPointerException("chassi");
		
		if (montadora == null)
			throw new NullPointerException("montadora");

		if (modelo == null)
			throw new NullPointerException("modelo");

		if (cor == null)
			throw new NullPointerException("cor");

		if (preco < 0)
			throw new InvalidParameterException("preco");
		
		this.chassi = chassi;
		this.montadora = montadora;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	//get/set CHASSI
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	//get/set MONTADORA
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	//get/set MODELO
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//get/set COR
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	//get/set PREÇO
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	
}
