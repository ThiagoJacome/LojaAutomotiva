package av1;

public class Loja {
	String endereco;
	String nome;
	
	public Loja(String endereco, String nome){
		
		if (endereco == null)
			throw new NullPointerException("endereco");
		
		if (nome == null)
			throw new NullPointerException("nome");
		
		this.endereco = endereco;
		this.nome = nome;
	}
}
