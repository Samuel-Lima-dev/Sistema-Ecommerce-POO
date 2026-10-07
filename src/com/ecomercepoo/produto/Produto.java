package com.ecomercepoo.produto;
import com.ecomercepoo.exception.DadosInvalidosException;

public abstract class Produto {
	
	private String descricao;
	private double preco;
	
	public Produto(String descricao, double preco) {
		setDescricao(descricao);
		setPreco(preco);
	}
	
	//Método abstrato
	public abstract void detalheProduto();
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.isEmpty()) {
			throw new DadosInvalidosException("Produto precisa ter uma descrição");
		}
		this.descricao = descricao;
	}
	 
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco <= 0) {
			throw new DadosInvalidosException("Preço Invalido, preco não pode ser negativo");
		}
		this.preco = preco;	
	}
	
}
