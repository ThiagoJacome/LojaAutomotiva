package br.com.lojaautomovel.entidade;

public class Loja {

	private String endereco;
	private String nome;
	
	/**
	 * @get/set endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @get/set nome
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Loja(String endereco, String nome){
		
		if (endereco == null)
			throw new NullPointerException("endereco");
		
		if (nome == null)
			throw new NullPointerException("nome");
		
		this.endereco = endereco;
		this.nome = nome;
	}
	
}
