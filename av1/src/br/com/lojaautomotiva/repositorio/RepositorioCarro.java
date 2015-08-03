package br.com.lojaautomotiva.repositorio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.lojaautomovel.entidade.*;

public class RepositorioCarro {
				
	public void adicionarCarro(){
		
		ArrayList<Carro> carros = new ArrayList<>();
		
		System.out.println("###Método Adicionar Carro###");
		
		Carro novoCarro = new Carro("12121asa323asa", "Fiat", "Uno", "Branco", 30.000f, "Manual", 1.0f);
				
		carros.add(novoCarro);		
		System.out.println("Carro adicionado com sucesso.");
		}
		
		public void listarEstoquedeCarros(){
			
			System.out.println("###Método Listar Carro###");
			
			ArrayList<Carro> carro = loja.getEstoquedeCarros();
			
			  for (int i = 0; i < carro.size(); i++) {
				  
					  System.out.println(carro.get(i).getModelo());  			  
				    
			   }			
			
		}
		
		public void buscarCarro(String chassi){
			
			System.out.println("###Método Buscar Carro###");
			
			ArrayList<Carro> carro = Loja.getEstoquedeCarros();
			int quantidadeCarrosEncontrados = 0;
			
			 for (int i = 0; i < carro.size(); i++) {
				 
				 if(carro.get(i).getChassi() == chassi){	
					 quantidadeCarrosEncontrados++;
					 System.out.println(carro.get(i).getMontadora()+" - "+carro.get(i).getModelo()+" - "+carro.get(i).getCor());				 				
				 }			 			 
			 
			 }
			 
			 System.out.println("Foram encontrados "+quantidadeCarrosEncontrados+" carro(s) com o chassi passado.");				
		}
		
		public void pesquisarCarro(String modelo){
			
			System.out.println("###Método Pesquisar Carro###");
			
			ArrayList<Carro> carro = loja.getEstoquedeCarros();
			
			 for (int i = 0; i < carro.size(); i++) {
				 
				 if(carro.get(i).getModelo() == modelo){				 
					 System.out.println(carro.get(i).getModelo());				 				
				 }
			 
			 }		
			
		}
}
